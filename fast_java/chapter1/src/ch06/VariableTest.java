package ch06;

public class VariableTest {

	public static void main(String[] args) {
    
		byte bnum = -128; //byte bnum = 128 => error
		
		System.out.println(bnum);
		
		//int num = 123124513254125; => out of range
		long lNum = 12312412312321L; //작은 수를 long으로 선언해도 오류는 나지 않는다.
		System.out.println(lNum);
	}

}
