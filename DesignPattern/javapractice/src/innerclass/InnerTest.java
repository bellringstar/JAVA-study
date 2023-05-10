package innerclass;


class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }
    class InClass{
        // 이너클래스의 경우 outer가 생성된 뒤 생성
        int iNum = 100;

        void inTest(){
            System.out.println("num = " + num);
            System.out.println("sNum = " + sNum);
            System.out.println("iNum = " + iNum);
        }

    }

    public void usingClass(){
        inClass.inTest();
    }

    static class InStaticClass{
        //정적 내부 클래스
        int iNum = 100;
        static int sInNum = 200;
        void inTest(){
//            System.out.println("num = " + num); static이기 때문에 외부 클래스 생성 전에 사용될수있다.
            System.out.println("sNum = " + sNum);
            System.out.println("iNum = " + iNum);
        }

        static void sTest(){

        }

    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();

//        OutClass.InClass inner = outClass.new InClass();
//        inner.inTest();

    }

}
