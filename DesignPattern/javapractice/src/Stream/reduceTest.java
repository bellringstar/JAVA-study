package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class reduceTest {
    public static void main(String[] args) {

        String[] greetings = {"안녕하세요~~~~", "hello", "Good morning", "반가워요!!"};

        System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());

        System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)->{
            return s1.getBytes().length>=s2.getBytes().length?s1:s2;
        }));
        
        String s = "안녕하십니까";
        byte[] arr = s.getBytes();
        for(byte b : arr){
            System.out.println("b = " + b);
        }
        String str = new String(arr);
        System.out.println("str = " + str);
    }   
}


class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        return s1.getBytes().length>=s2.getBytes().length?s1:s2;
    }
}