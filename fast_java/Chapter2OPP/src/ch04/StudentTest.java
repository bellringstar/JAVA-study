package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //변수타입 + 변수명 = new Student 하나 생성 -> 인스턴스
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "광주";
		
		studentKim.showStudentInfo();
		
	}

}
