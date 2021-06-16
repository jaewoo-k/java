package ToyProject.CarTax.model.vo;

public class Car {
	private int emissions;	  	// ��ⷮ
	private int emissionsTax; 	// cc�� ����
	private int year;			// ���� ����
	private boolean business;	// ������ : T, �񿵾���: F;
	
	private double taxOfEmissions;	// �ڵ���cc����
	private double taxOfEdu;	// �ڵ��� ������
	private double totalTax;	// �� �ڵ�����
	
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
