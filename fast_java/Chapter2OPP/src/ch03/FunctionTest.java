package ch03;

public class FunctionTest {

	
	public static int addnum(int num1, int num2) {
		int rst;
		rst = num1 + num2;
		return rst;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum(){
		
		int sum = 0;
		
		for (int i=0;i<=100;i++ ) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		int n1 = 10;
		int n2 = 90;
		
		int total = addnum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);

	}

}
