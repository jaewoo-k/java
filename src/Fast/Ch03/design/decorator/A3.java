package Fast.Ch03.design.decorator;

public class A3 extends AudiDecorator{

	// modelPrice를 받지 않고, 직접 정의해줌 여기선 1000
	public A3(ICar audi, String modelName) {
		super(audi, modelName, 1000);
	}
	
}
