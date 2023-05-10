package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 3, 4, 5, 1, 2, -44};

        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        lst.stream().forEach(s-> System.out.println(s));

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);
        
        int[] newArr = Arrays.stream(arr).filter(s-> s>0).toArray();
        Arrays.stream(newArr).forEach(s-> System.out.println("s = " + s));
        
        int[] toarr = lst.stream().map(c->c*2).mapToInt(s->s).toArray();

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        System.out.println("--------------");
        Arrays.stream(sortedArr).forEach(s-> System.out.println(s));
    }
}
