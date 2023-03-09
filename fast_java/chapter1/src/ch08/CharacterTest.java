package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);//A
		System.out.println((int)ch1);//65
		
		char ch2 = 66;
		System.out.println(ch2);//B
		System.out.println((char)ch2);//B
		
		int ch3 = 67;
		System.out.println(ch3); //67
		System.out.println((char)ch3); //C
		
//		char ch = -66; //error
		
		char han = '한';
		char ch = '\uD55C';
		System.out.println(han);//한
		System.out.println(ch);//한
	}

}
