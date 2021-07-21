package Fast.Ch02.ch08;

public class OrderInfo {
	private String orderNum;	//PK   �ֹ� ���� ��ȣ
	private String customerPhone;	// �ֹ� �ڵ��� ��ȣ
	private String customerAddress; // �ֹ� �� �ּ�
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
		sb.append("�ֹ� ���� ��ȣ : ").append(orderNum).append(System.lineSeparator())
		.append("�ֹ� �ڵ��� ��ȣ : ").append(customerPhone).append(System.lineSeparator())
		.append("�ֹ� �� �ּ� : ").append(customerAddress).append(System.lineSeparator())
		.append("�ֹ� ��¥ : ").append(orderDate).append(System.lineSeparator())
		.append("�ֹ� �ð� : ").append(orderTime).append(System.lineSeparator())
		.append("�ֹ� ���� : ").append(orderPrice).append(System.lineSeparator())
		.append("�ֹ� �޴� : ").append(orderMenu);
	
		System.out.println(sb);
		
	}
	
	
	
}
