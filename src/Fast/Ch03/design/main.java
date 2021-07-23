package Fast.Ch03.design;

import Fast.Ch03.design.adapter.AirConditioner;
import Fast.Ch03.design.adapter.Cleaner;
import Fast.Ch03.design.adapter.Electronic110V;
import Fast.Ch03.design.adapter.HairDryer;
import Fast.Ch03.design.adapter.SocketAdapter;
import Fast.Ch03.design.decorator.A3;
import Fast.Ch03.design.decorator.A4;
import Fast.Ch03.design.decorator.A5;
import Fast.Ch03.design.decorator.Audi;
import Fast.Ch03.design.decorator.ICar;

public class main {

	public static void main(String[] args) {
		/*
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();
		
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("두개의 객체가 동일한가?");
		System.out.println(aClient.equals(bClient));
		*/
		
		// 110V
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		// 220V
		Cleaner cleaner = new Cleaner();
		// 110V를 받는 static 메소드 이기때문에 220V인 cleaner는 불가능 따라서 adapter클래스로 
//		connect(cleaner); // 220V
//		Electronic110V adapter = new SocketAdapter(new Electronic220V); // 이렇게 새로운 객체를 new 해서 전달하는게 아니라, 
		// adapter 클래스를 통해 인터페이스 형태를 맞춤
		Electronic110V adapter = new SocketAdapter(cleaner); 
		connect(adapter);
		
		AirConditioner airConditioner = new AirConditioner();
		// 110V 인터페이스 = new 110V로 만든 어댑터클래스(220V구현 클래스);
		Electronic110V adapter_airCon = new SocketAdapter(airConditioner);
		connect(adapter_airCon);
		
		System.out.println("=========Proxy=========");
		// Proxy
		/*
		Browser browser = new Browser("www.naver.com");
		browser.show();
		
		IBrowser browser = new BrowserProxy("www.naver.com");
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		*/
		
		/*
		// 시간체크를 위해 아토믹 사용
		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();
		
		IBrowser aopBrowser = new AopBrowser("www.naver.com",
				//람다식으로 표현
				()->{
					System.out.println("before");
					start.set(System.currentTimeMillis());
					},
				()->{
					long now = System.currentTimeMillis();
					end.set(now - start.get());
					}
		);   
				
		aopBrowser.show();
		System.out.println("loading time : " + end.get());	// 처음 호출 시 1500millis 걸리지만
		
		aopBrowser.show();
		System.out.println("loading time : " + end.get());	// 두번째 호출 시 캐시를 활용하기 떄문에 0이 걸림
		*/
		
		// Decorator
		// 기본 뼈대인 Audi 클래스를 냅두고, audi인스턴스를 전달해서 
		// AudiDecorator 를 extends(상속)받은 A3, A4클래스들의 인스턴스만 수정(첨가)하여 모델을 만들었다.
		// 
		ICar audi = new Audi(1000);
		audi.showPrice();
		
		// a3
		ICar audi3 = new A3(audi, "A3");
		audi3.showPrice();
		// a4
		ICar audi4 = new A4(audi, "A4");
		audi4.showPrice();
		// a5
		ICar audi5 = new A5(audi, "A5");
		audi5.showPrice();
	}
	
	// 콘센트
	public static void connect(Electronic110V electronic110V) {
		electronic110V.powerOn();
	}
}
