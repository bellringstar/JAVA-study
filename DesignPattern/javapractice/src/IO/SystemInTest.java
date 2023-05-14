package IO;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        //InputStream / Reader

//        System.out.println("알파벳 하나를 쓰고 [ENTER}를 누르세요");
//
//        int i;
//        try {
//            i = System.in.read(); //byte로 받는다
//            System.out.println("i = " + i);
//            System.out.println("(char)i = " + (char)i);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("알파벳 여러개를 쓰고 [ENTER]를 누르세요");

        int j;
        try{
            InputStreamReader irs = new InputStreamReader(System.in);
            while ((j = irs.read()) != '\n'){
                System.out.print((char)j);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
