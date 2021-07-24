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
import Fast.Ch03.design.facade.Ftp;
import Fast.Ch03.design.facade.Reader;
import Fast.Ch03.design.facade.SftpClient;
import Fast.Ch03.design.facade.Writer;
import Fast.Ch03.design.observer.Button;
import Fast.Ch03.design.observer.IButtonListener;

public class Main {

	public static void main(String[] args) {
		/*
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();
		
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("�ΰ��� ��ü�� �����Ѱ�?");
		System.out.println(aClient.equals(bClient));
		*/
		
		// 110V
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		// 220V
		Cleaner cleaner = new Cleaner();
		// 110V�� �޴� static �޼ҵ� �̱⶧���� 220V�� cleaner�� �Ұ��� ���� adapterŬ������ 
//		connect(cleaner); // 220V
//		Electronic110V adapter = new SocketAdapter(new Electronic220V); // �̷��� ���ο� ��ü�� new �ؼ� �����ϴ°� �ƴ϶�, 
		// adapter Ŭ������ ���� �������̽� ���¸� ����
		Electronic110V adapter = new SocketAdapter(cleaner); 
		connect(adapter);
		
		AirConditioner airConditioner = new AirConditioner();
		// 110V �������̽� = new 110V�� ���� �����Ŭ����(220V���� Ŭ����);
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
		// �ð�üũ�� ���� ����� ���
		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();
		
		IBrowser aopBrowser = new AopBrowser("www.naver.com",
				//���ٽ����� ǥ��
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
		System.out.println("loading time : " + end.get());	// ó�� ȣ�� �� 1500millis �ɸ�����
		
		aopBrowser.show();
		System.out.println("loading time : " + end.get());	// �ι�° ȣ�� �� ĳ�ø� Ȱ���ϱ� ������ 0�� �ɸ�
		*/
		
		// Decorator
		// �⺻ ������ Audi Ŭ������ ���ΰ�, audi�ν��Ͻ��� �����ؼ� 
		// AudiDecorator �� extends(���)���� A3, A4Ŭ�������� �ν��Ͻ��� ����(÷��)�Ͽ� ���� �������.
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
		
		
		// observer
		Button button = new Button("��ư");
		
		button.addListener(new IButtonListener() {
			@Override
			public void clickEvent(String event) {
				System.out.println(event);
			}
		});
		
		
		button.click("�޼��� ���� : click1");
		button.click("�޼��� ���� : click2");
		button.click("�޼��� ���� : click3");
		button.click("�޼��� ���� : click4");
		button.click("�޼��� ���� : click5");
		
		
		// facade : ���յ��� ������ �������̽��� �߰��� �ξ� �ڵ带 �������� ����� ����
		Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
		ftpClient.connect();
		ftpClient.moveDirectory();
		
		Writer writer = new Writer("text.tmp");
		writer.fileConnect();
		writer.write();
		
		Reader reader = new Reader("text.tmp");
		reader.fileConnect();
		reader.fileRead();
		
		reader.fileDisconnect();
		writer.fileDisconnect();
		ftpClient.disConnect();
		
		// ���� �ڵ带 ����
		SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
		sftpClient.connect();
		
		sftpClient.write();
		
		sftpClient.read();
		
		sftpClient.disConnect();
		
		
		
		
		
		
		
		
		
		
	}
	
	// �ܼ�Ʈ
	public static void connect(Electronic110V electronic110V) {
		electronic110V.powerOn();
	}
}
