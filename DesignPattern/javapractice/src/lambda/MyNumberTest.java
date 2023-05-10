package lambda;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber maxFunction = (x,y) -> x>y?x:y;

        System.out.println(maxFunction.getMax(1,6));
    }
}
