package Abstraction;

abstract class A{
        abstract void show();
        abstract void method();

        void disp(){
            System.out.println("this is disp method of class A ");
        }
}
 abstract class Abstraction1 extends A {

    
}
public class Abstraction extends A{
    // @Override //annottation
    void show(){
        System.out.println("this is show method of class Abstraction");
    }


    // @Override
    void method(){
        System.out.println("this is  method of class Abstraction");
    }

    public static void main(String[] args) {
        A a = new Abstraction() ;
        a.disp();
        a.method();
        a.show();
    }
}
