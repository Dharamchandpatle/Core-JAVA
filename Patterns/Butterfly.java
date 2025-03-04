package Patterns;

public class Butterfly {
    public static void main(String aa[]) {
        int n = 5;

        // upper part

        // first part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // 2nd parrt
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println( " ");

        }


        // upper part

        // first part
        for (int i = n; i>= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // 2nd parrt
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println( " ");

        }


    }

}
