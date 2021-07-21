package Fast.Ch02.ch08;

public class OrderTest {

	public static void main(String[] args) {
		OrderInfo oi = new OrderInfo("0001", "010-1234-3333", "경기도", "2021.07.21", "16:19:00", 16500, "치킨먹고싶다");
		oi.showOrderDetail();
	}
}
