package Fast.Ch02.ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		System.out.println("student ����");
	}
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentNumber + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
	
	
	
	public static void main(String[] args) {
		Student st = new Student();
		
		st.grade = 1;
		System.out.println(st.showStudentInfo());
		
		Student stKim = new Student(1473059433, "Kim", 3);
		System.out.println(stKim.showStudentInfo());
				
	}
}
   