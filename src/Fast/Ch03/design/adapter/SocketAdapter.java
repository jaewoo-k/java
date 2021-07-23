package Fast.Ch03.design.adapter;

// 110V -> 220V로 변환해주는 Adapter
public class SocketAdapter implements Electronic110V{
	// 연결시켜줘야할 220V를 갖고있어야함
	private Electronic220V electronic220V;
	
	// 생성자에서 매개변수로 받은 220V을 받아서 멤버변수에 할당해줌
	public SocketAdapter(Electronic220V electronic220V) {
		this.electronic220V = electronic220V;
	}
	
	@Override
	public void powerOn() {
		// 생성자 호출될때 220V의 connect를 호출해줌
		electronic220V.connect();
	}
}
