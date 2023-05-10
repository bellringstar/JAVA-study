package lambda;

public class AddTest {
    public static void main(String[] args) {
        Add addFunction = (x,y)-> {return x+y;};
        System.out.println(addFunction.add(1,6));
    }


}
