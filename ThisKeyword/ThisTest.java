package ThisKeyword;

public class ThisTest {
    int x = 10 ;
    // static ThisTest t ;

    void show(int x , ThisTest t ){
        System.out.println(x);
        System.out.println(t.x);
        System.out.println(t);
        System.out.println(this);

    }

    public static void main( String aa[]){
        ThisTest t = new ThisTest();
        //  t = new ThisTest();
        t.show(20 , t);

        ThisTest t1 = new ThisTest();
        //  t = new ThisTest();
        t.show(20 , t1);

    }
}
