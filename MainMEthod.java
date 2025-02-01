class demo {
    public static void main(String aa[])
    // public static void main(String ...aaa)
    {
        System.out.println("Main B ");
    }
}
public class MainMEthod {
    public static void main(String aaaa[]){
        // demo.main(aaaa);

        // String s[] = {"hii"};
        // demo.main(s);

        demo.main(null);

        // demo.main();

        for( int i =0 ; i<aaaa.length ; i++){
            System.out.println(aaaa[i]);
        }
        System.out.println( "Main method ");
    }
}
