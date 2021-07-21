package Fast.Ch02.ch08;

public class OrderInfo {
	private String orderNum;	//PK   주문 접수 번호
	private String customerPhone;	// 주문 핸드폰 번호
	private String customerAddress; // 주문 집 주소
	private String orderDate;
	private String orderTime;
	private int orderPrice;
	private String orderMenu;
	
	public OrderInfo(String orderNum, String orderPhone, String orderAddress, String orderDate, String orderTime,
			int orderPrice, String orderMenu) {
		super();
		this.orderNum = orderNum;
		this.customerPhone = orderPhone;
		this.customerAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenu = orderMenu;
	}
	
	public void showOrderDetail() {
		StringBuilder sb = new StringBuilder();
		sb.append("주문 접수 번호 : ").append(orderNum).append(System.lineSeparator())
		.append("주문 핸드폰 번호 : ").append(customerPhone).append(System.lineSeparator())
		.append("주문 집 주소 : ").append(customerAddress).append(System.lineSeparator())
		.append("주문 날짜 : ").append(orderDate).append(System.lineSeparator())
		.append("주문 시간 : ").append(orderTime).append(System.lineSeparator())
		.append("주문 가격 : ").append(orderPrice).append(System.lineSeparator())
		.append("주문 메뉴 : ").append(orderMenu);
	
		System.out.println(sb);
		
	}
	
	
	
}
