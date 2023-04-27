package ch05;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		System.out.println("Student 인스턴스 생성");
//		studentName = studentName; 에러가 난다. 
		this.studentName = studentName;
//		멤버변수를 가리키기 위해 this
	}
	public String showStudentInfo() {
		
		return studentNumber + "학생의 이름은 " + studentName + "이고, " + grade + "학년 입니다.";
	}
}
