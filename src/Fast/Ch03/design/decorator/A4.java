package Fast.Ch03.design.decorator;

public class A4 extends AudiDecorator{

	// modelPrice�� ���� �ʰ�, ���� �������� ���⼱ 1000
	public A4(ICar audi, String modelName) {
		super(audi, modelName, 2000);
	}
	
}
