package Fast.Ch02.ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setYear(2021);
		date.setMonth(12);
		// date.month = 100; �� ���� �͵�,
		// ������ �����ֱ� ���� private�� �����ϸ�
		// getter setter�� ���
		date.setDay(30);
		
		date.showDate();
	}
}