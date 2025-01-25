
class A //extends B
{
    static {
        System.out.println(" Loading class A");
    }
}

class B {
    static {
        System.out.println(" Loading class B");
    }
}

public class StaticClassLoading //extends A
 {
    static {
        A a = new A();
        B b = new B();
        System.out.println("Static class loading ");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
