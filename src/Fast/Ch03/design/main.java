package Fast.Ch03.design;

import Fast.Ch03.design.adapter.AirConditioner;
import Fast.Ch03.design.adapter.Cleaner;
import Fast.Ch03.design.adapter.Electronic110V;
import Fast.Ch03.design.adapter.HairDryer;
import Fast.Ch03.design.adapter.SocketAdapter;
import Fast.Ch03.design.proxy.BrowserProxy;
import Fast.Ch03.design.proxy.IBrowser;

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
		
//		Browser browser = new Browser("www.naver.com");
//		browser.show();
		
		IBrowser browser = new BrowserProxy("www.naver.com");
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		
	}
	
	// 콘센트
	public static void connect(Electronic110V electronic110V) {
		electronic110V.powerOn();
	}
}
