// package LoadingTest; 

import java.util.Scanner;

class A {
    static {
        System.out.println(" Loading class A");
    }
}

class B {
    static {
        System.out.println(" Loading class B");
    }
}

public class DynamicClassLoading {
    static {
        System.out.println("This is static class loading ");
    }

    public static void main(String aa[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENter the class name of class to be loaded : ");
        String name = in.next();

        try {
            Class c = Class.forName(name);
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
