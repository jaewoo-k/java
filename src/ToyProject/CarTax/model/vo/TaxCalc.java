package ToyProject.CarTax.model.vo;

public class TaxCalc /*extends Car*/{
	
	private Car c;
	
	public TaxCalc() {}
	
	


	// ��ⷮ�Է�(�Ϲ�)
	public int TaxCalc(int emission) {
		// cc�� ����
		int emissionTax = 0;
			
		if (emission <= 1000) {
			emissionTax = emission * 80;
		}else if(emission <= 1600) {
			emissionTax = emission * 140;
		}else /*if(emission <= 2000)*/ {
			emissionTax = emission * 200;
		}
		/*else if(emission >2000){
			
		}*/
		
		System.out.println(emissionTax);
		return emissionTax;
	}
	// �ڵ��� ������(�Ϲ�)
	public int TaxOfEducation(int emissionTax) {
		double emssionDouble = (double)emissionTax * 0.3;	// ���汳������ �ڵ�����*0.3
//		System.out.println("emssionDouble : " + emssionDouble);
		
		int  TaxOfEducation = 0;
		TaxOfEducation = (int)Math.floor(emssionDouble/10)*10;	// 1�� �ڸ��� ����
//		System.out.println("TaxOfEducation : " + TaxOfEducation);
		
		return TaxOfEducation;
		
	}
	
	// 1�� �� �ڵ����� (��ⷮ���� + �ڵ���������)
	public int TaxOfYear(int emission) {
		int emissionTax = TaxCalc(emission);				// ��ⷮ����
		int TaxOfEducation = TaxOfEducation(emissionTax);	// �ڵ��� ������
		
		return emissionTax + TaxOfEducation;	// ��ⷮ ���� + �ڵ���������
	}
	
	
	
	
	// ������, getterSetter
	public TaxCalc(Car c) {
		super();
		this.c = c;
	}
	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}

	
	
	
	
	

	
	
	
}
