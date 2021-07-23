package Fast.Ch03.design.singleton;

public class AClazz {
	
	private SocketClient socketClient;
	
	// 기본생성자에서 초기화해줌
	public AClazz() {
		// new가아닌 getInstance를 통해 초기화
		this.socketClient = SocketClient.getInstance();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
	
}
