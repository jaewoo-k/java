package Fast.Ch02.ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setYear(2021);
		date.setMonth(12);
		// date.month = 100; 과 같은 것들,
		// 오류를 막아주기 위해 private로 제한하며
		// getter setter를 사용
		date.setDay(30);
		
		date.showDate();
	}
}