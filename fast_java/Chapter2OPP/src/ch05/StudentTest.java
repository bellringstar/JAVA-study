package ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
//	 클래스에 생성자가 없는 경우에만 초기 생성자 제공 이를 사용하고 싶으면 default 생성자를 만들어놔야 한다.
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}

