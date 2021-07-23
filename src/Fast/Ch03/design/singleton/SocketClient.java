package Fast.Ch03.design.singleton;

public class SocketClient {
	// �̱���
	// �ڱ� �ڽ��� ��ü�� ���� �־����
	// static �޼ҵ带 ���� �ֱ� ������ �ڱ��ڽŵ� static
	private static SocketClient SocketClient = null;
	
	// �⺻������ private�� ���ƾ���
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
	
	
	
	// default ������ ����, static�޼ҵ带 ���ؼ� getInstance�� ������ְ�
	// �ڱ� �ڽŰ�ü�� null�� ���, ���� ������ ���ְ� 
	// �ƴ϶�� �ڱ��ڽ��� �������ָ� ��.
}
