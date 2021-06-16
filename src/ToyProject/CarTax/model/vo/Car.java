package ToyProject.CarTax.model.vo;

public class Car {
	private int emissions;	  	// 배기량
	private int emissionsTax; 	// cc당 세금
	private int year;			// 차량 연식
	private boolean business;	// 영업용 : T, 비영업용: F;
	
	private double taxOfEmissions;	// 자동차cc세금
	private double taxOfEdu;	// 자동차 교육세
	private double totalTax;	// 총 자동차세
	
	public Car() {}

	public Car(int emissions, int emissionsTax, int year, boolean business) {
		super();
		this.emissions = emissions;
		this.emissionsTax = emissionsTax;
		this.year = year;
		this.business = business;
	}

	public int getEmissions() {
		return emissions;
	}

	public void setEmissions(int emissions) {
		this.emissions = emissions;
	}

	public int getEmissionsTax() {
		return emissionsTax;
	}

	public void setEmissionsTax(int emissionsTax) {
		this.emissionsTax = emissionsTax;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isBusiness() {
		return business;
	}

	public void setBusiness(boolean business) {
		this.business = business;
	}

	public double getTaxOfEmissions() {
		return taxOfEmissions;
	}

	public void setTaxOfEmissions(double taxOfEmissions) {
		this.taxOfEmissions = taxOfEmissions;
	}

	public double getTaxOfEdu() {
		return taxOfEdu;
	}

	public void setTaxOfEdu(double taxOfEdu) {
		this.taxOfEdu = taxOfEdu;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	
	
}
