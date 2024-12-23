package InitBlock;

public class Test {
    Test(){
         System.out.println(" This is a default constructor ");
    }
    Test(int a ){
        System.out.println(a);
    }
    // InitBlock ...
    {
        System.out.println(" This is a first intBloack .");
    }
    {
        System.out.println(" This is a Second intBloack .");
    }
    
    public static void main (String aa[]){
        new Test();
        new Test(10);

    }
}
