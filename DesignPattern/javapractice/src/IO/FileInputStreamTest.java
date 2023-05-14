package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {
//        FileInputStream fis = null;
//
//        try{
//            fis = new FileInputStream("input.txt");
//
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally{
//            try{
//                fis.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("--------end----------");

        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis2 = new FileInputStream("input2.txt")) {

            byte[] bs = new byte[10];
            int i;
            while ((i = fis2.read(bs)) != -1) {
                for (byte b : bs) { // 남아있는 것 까지 읽어버린다
                    System.out.println((char) b);
                }
                for (int j = 0; j<i;j++){
                    System.out.println((char)bs[j]);
                }
            }

            while ((i = fis2.read(bs, 1, 9)) != -1) {
                for (int k = 0; k < i; k++) {
                    System.out.println((char) bs[k]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
