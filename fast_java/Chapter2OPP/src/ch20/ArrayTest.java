package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i=0, num=1; i<arr.length; i++,num++) {
			arr[i] = num;
			System.out.println(arr[i]);
		}
		
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}	

}
