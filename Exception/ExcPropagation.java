import java.io.IOException;;
public class ExcPropagation {
    
    static void show() throws IOException
    {
        System.out.println("Show method ");
    throw new Exception();


    }
    static void disp() throws IOException
    {
        System.out.println("disp method ");

    }
    static void rem() throws IOException
    {
        System.out.println("rem method ");

    }
    public static void main(String aa[]){
        try {
            rem();;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("rest of the code ");
    }
}
