package Fast.Ch02.ch09;

public class SubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setKoreaSubject("����", 99);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("����", 50);
		studentKim.setKoreaSubject("����", 65);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
