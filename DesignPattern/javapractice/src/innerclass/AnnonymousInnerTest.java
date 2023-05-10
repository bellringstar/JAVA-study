package innerclass;

class Outer2{

    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnalbe(int i){

        int num = 10;
        return new Runnable(){
            int localNum = 1000;
            @Override
            public void run() {
//                i = 50;
//                num = 20;  불가능/ 생성 주기가 다르다. 결국 자동으로 final로 처리 됐다는 소리

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum);
                System.out.println("Outer2.sNum = " + Outer2.sNum);
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            
        }
    };
}

public class AnnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnalbe(100);

        runner.run();
    }
}
