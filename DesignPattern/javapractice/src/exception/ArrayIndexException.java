package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            for(int i = 0; i<7; i++){
                System.out.println("i = " + arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("e.toString() = " + e.toString());
        }
        
        try (FileInputStream fis = new FileInputStream("a.txt")){
            System.out.println("fis = " + fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
