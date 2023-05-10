import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int q = 1;
        int r = 0;
        String code = "programmers";
        int i = 0;
        int idx = r;
        String answer = "";
        while(idx<code.length()){
            answer += code.charAt(idx);
            idx = (++i)*q + r;
        }

        System.out.println("answer = " + answer);


    }
}
