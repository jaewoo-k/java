package Fast.Ch02.ch10;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;	// default�� false
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(1 <= day || day <= 31) {
			switch (month) {
			// 1 <=  day  <= 31 �� �ƴ϶�� false, (1,3,5,7,8,10,12 �� �����൵��)
			/*
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: break;
			 */
			case 4:
			case 6:
			case 9:
			case 11:
				if(day == 31 ) {
					isValid = false;
				}
				break;
			case 2:
				if(year % 4 == 0) {
					if(year % 100 == 0) {
						//28�ϱ���
						if(day ) {
							day = 28;
						}else if(year % 400 == 0) {
							day = 29;
						}
						day = 29;
					}else {
						day = 28;
					}
//			isValid = true;
					break;
				}
			}
			isValid = true;
			this.day = day;
		}else {
			isValid = false;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		// �����ϴ� ��¥���
		if(isValid) {
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		}else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
}
