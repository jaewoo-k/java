package Fast.Ch03.design.decorator;

public class A5 extends AudiDecorator{

	// modelPrice�� ���� �ʰ�, ���� �������� ���⼱ 1000
	public A5(ICar audi, String modelName) {
		super(audi, modelName, 3000);
	}
	
}
