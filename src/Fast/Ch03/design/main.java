package Fast.Ch03.design;

import Fast.Ch03.design.adapter.AirConditioner;
import Fast.Ch03.design.adapter.Cleaner;
import Fast.Ch03.design.adapter.Electronic110V;
import Fast.Ch03.design.adapter.HairDryer;
import Fast.Ch03.design.adapter.SocketAdapter;

public class main {

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
	}
	
	// �ܼ�Ʈ
	public static void connect(Electronic110V electronic110V) {
		electronic110V.powerOn();
	}
}
