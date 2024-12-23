package InitBlock;

public class Test1 {

    Test1(){
        System.out.println(" Default cons/....");

    }
    {
        System.out.println(" init block 1");
    }
    {
        System.out.println(" init block 2");
    }
    {
        System.out.println(" init block 3");
    }

    public static void main(String aa[]){
        new Test1();
        new Test1();
        new Test1();
        {
            System.out.println(" init block 5 ");
            {
                System.out.println(" main block ");
            }
        }

    }
    {
        System.out.println(" init block 6");
    }
    {
        System.out.println(" init block 7");
    }
}
