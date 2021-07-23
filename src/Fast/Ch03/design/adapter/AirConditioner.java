package Fast.Ch03.design.adapter;

public class AirConditioner implements Electronic220V{

	@Override
	public void connect() {
		System.out.println("¿¡¾îÄÁ 220V on");
		
	}

}
