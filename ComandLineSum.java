// package MainMethod;

public class ComandLineSum {
    public static void main(String aa[]){
        int x = 10 ;
        System.out.println(x);

        String s1 = aa[0];
        String s2 = aa[1];

        System.out.println(s1 + s2 );

        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        System.out.println("Sum = " +(d1+d2));



    }
}
