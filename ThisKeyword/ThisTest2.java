package ThisKeyword;

public class ThisTest2 {
    static void m1( A a){
        System.out.println("mi is calling ");
        a.disp();
    }
    
}

 class A{
     void show (){
        System.out.println("Sow method ");
        ThisTest2.m1(this);
     }

     void disp(){
        System.out.println("Disp ");
     }
}

class mainClass{
    public static void main(String aa[]){
        A a = new A();
        a.show();
    }
}