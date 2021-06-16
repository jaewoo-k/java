package ToyProject.CarTax.model.vo;

public class TaxCalc /*extends Car*/{
	
	private Car c;
	
	public TaxCalc() {}
	
	


	// 배기량입력(일반)
	public int TaxCalc(int emission) {
		// cc당 세금
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
	// 자동차 교육세(일반)
	public int TaxOfEducation(int emissionTax) {
		double emssionDouble = (double)emissionTax * 0.3;	// 지방교육세는 자동차세*0.3
//		System.out.println("emssionDouble : " + emssionDouble);
		
		int  TaxOfEducation = 0;
		TaxOfEducation = (int)Math.floor(emssionDouble/10)*10;	// 1의 자리는 버림
//		System.out.println("TaxOfEducation : " + TaxOfEducation);
		
		return TaxOfEducation;
		
	}
	
	// 1년 총 자동차세 (배기량세금 + 자동차교육세)
	public int TaxOfYear(int emission) {
		int emissionTax = TaxCalc(emission);				// 배기량세금
		int TaxOfEducation = TaxOfEducation(emissionTax);	// 자동차 교육세
		
		return emissionTax + TaxOfEducation;	// 배기량 세금 + 자동차교육세
	}
	
	
	
	
	// 생성자, getterSetter
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
