public class WrapperClass {
    public static void main(String aa[]){
        int x =10 ;
        System.out.println(x);

        Integer i = new Integer(x);// Boxing 
        System.out.println(i);

        int p = i.intValue();// Unboxing
        System.out.println(p);

     Integer ii = x ; // Autoboxng 
     int yy = ii ; // AutoUnboxing 

     System.out.println(ii);
     System.out.println(yy);
    }
}
