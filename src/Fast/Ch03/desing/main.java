package Fast.Ch03.desing;

import Fast.Ch03.desing.singleton.AClazz;
import Fast.Ch03.desing.singleton.BClazz;
import Fast.Ch03.desing.singleton.SocketClient;

public class main {

	public static void main(String[] args) {
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();
		
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("두개의 객체가 동일한가?");
		System.out.println(aClient.equals(bClient));
	}

}
