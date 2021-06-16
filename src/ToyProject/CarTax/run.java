package ToyProject.CarTax;

import ToyProject.CarTax.model.vo.Car;
import ToyProject.CarTax.model.vo.TaxCalc;

public class run {

	public static void main(String[] args) {
		// »ý¼º½Ã 
		TaxCalc tc = new TaxCalc(new Car());
//		tc.setC(setEmissions)
		int tax = tc.TaxCalc(1500);
		int taxedu = tc.TaxOfEducation(50615);
		
		System.out.println(tc.TaxOfEducation(1499));
		System.out.println(tc.TaxOfYear(1499));
//		System.out.println(c);
		
		
	}

}
