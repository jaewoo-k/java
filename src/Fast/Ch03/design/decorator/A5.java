package Fast.Ch03.design.decorator;

public class A5 extends AudiDecorator{

	// modelPrice를 받지 않고, 직접 정의해줌 여기선 1000
	public A5(ICar audi, String modelName) {
		super(audi, modelName, 3000);
	}
	
}
