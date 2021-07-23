package Fast.Ch03.design.singleton;

public class AClazz {
	
	private SocketClient socketClient;
	
	// �⺻�����ڿ��� �ʱ�ȭ����
	public AClazz() {
		// new���ƴ� getInstance�� ���� �ʱ�ȭ
		this.socketClient = SocketClient.getInstance();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
	
}
