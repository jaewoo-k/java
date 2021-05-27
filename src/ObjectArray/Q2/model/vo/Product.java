package ObjectArray.Q2.model.vo;

import ObjectArray.Q2.controller.ProductController;

public class Product {
	private int pId;		// ��ǰ ��ȣ
	private String pName; 	// ��ǰ��
	private int price;		// ��ǰ ����
	private double tax;		// ��ǰ ����
	
	public Product() {}
	public Product(int pId, String pName, int price, double tax) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductController.count++;
	}
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String information() {
		
		return "��ǰ ��ȣ : " + pId + 
				"\n ��ǰ �� : " + pName +
				"\n ��ǰ ���� : " + price + 
				"\n ��ǰ ���� : " + tax;
	}
}
