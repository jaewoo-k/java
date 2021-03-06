package ObjectArray.Q2.model.vo;

import ObjectArray.Q2.controller.ProductController;

public class Product {
	private int pId;		// 力前 锅龋
	private String pName; 	// 力前疙
	private int price;		// 力前 啊拜
	private double tax;		// 力前 技陛
	
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
		
		return "力前 锅龋 : " + pId + 
				"\n 力前 疙 : " + pName +
				"\n 力前 啊拜 : " + price + 
				"\n 力前 技陛 : " + tax;
	}
}
