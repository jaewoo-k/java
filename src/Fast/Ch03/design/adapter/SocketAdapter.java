package Fast.Ch03.design.adapter;

// 110V -> 220V�� ��ȯ���ִ� Adapter
public class SocketAdapter implements Electronic110V{
	// ������������ 220V�� �����־����
	private Electronic220V electronic220V;
	
	// �����ڿ��� �Ű������� ���� 220V�� �޾Ƽ� ��������� �Ҵ�����
	public SocketAdapter(Electronic220V electronic220V) {
		this.electronic220V = electronic220V;
	}
	
	@Override
	public void powerOn() {
		// ������ ȣ��ɶ� 220V�� connect�� ȣ������
		electronic220V.connect();
	}
}
