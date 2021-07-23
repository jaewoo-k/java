package Fast.Ch03.design.singleton;

public class BClazz {
	
	private SocketClient socketClient;
	
	public BClazz() {
		this.socketClient = socketClient.getInstance();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
}
