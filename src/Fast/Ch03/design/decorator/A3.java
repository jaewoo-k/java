package Fast.Ch03.design.decorator;

public class A3 extends AudiDecorator{

	// modelPrice�� ���� �ʰ�, ���� �������� ���⼱ 1000
	public A3(ICar audi, String modelName) {
		super(audi, modelName, 1000);
	}
	
}
