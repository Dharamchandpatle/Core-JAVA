// package LoadingTest; 

import java.util.Scanner;

class A {
    A(){
        System.out.println("A is a constructor ");
    }
    static {
        System.out.println(" Loading class A");
    }
}

class B {
    B(){
        System.out.println("B is a Constructor ");
    }
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
            try {
                c.newInstance();
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
