package Fast.Ch03.design.singleton;

public class SocketClient {
	// 싱글톤
	// 자기 자신을 객체로 갖고 있어야함
	// static 메소드를 갖고 있기 때문에 자기자신도 static
	private static SocketClient SocketClient = null;
	
	// 기본생성자 private로 막아야함
	private SocketClient() {}
	
	public static SocketClient getInstance() {
		
		if(SocketClient == null) {
			SocketClient = new SocketClient();
		}
		return SocketClient;
	}
	
	public void connect() {
		System.out.println("connect");
	}
	
	
	
	// default 생성자 막고, static메소드를 통해서 getInstance를 만들어주고
	// 자기 자신객체가 null일 경우, 새로 생성을 해주고 
	// 아니라면 자기자신을 리턴해주면 됨.
}
