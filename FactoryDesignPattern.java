class B {
    B() {
        System.out.println("B constructor is called...");
    }
}

class A {
    static B getObject() {
        B b = new B();
        System.out.println(b);
        return b;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        B b = A.getObject();
        System.out.println(b);
    }
}
