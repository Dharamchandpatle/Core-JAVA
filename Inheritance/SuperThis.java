package Inheritance;

class K {
    K() {
        System.out.println("K is constructor");
    }
}

class L extends K {
    L(int x) {
        this();  // Explicit call to superclass constructor
        System.out.println(x);
    }
    L() {
        super();  // Explicit call to superclass constructor
        System.out.println("L is constructor");
    }
}

public class SuperThis extends L {
    SuperThis() {
        super(43);  // Calls L's default constructor
        System.out.println("SuperThis is constructor");
    }

    public static void main(String[] args) {
        new SuperThis();
    }
}
