import java.util.Scanner;

class Abc{
    Abc(){
        System.out.println("Hello this is practice of dynamic loading ");
    }
}
class BB{
    BB(){
        System.out.println("Hello this is practice of dynamic loading ");
    }
}
public class PracticeDynamic {

    public static void main(String aa[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your loded class name ");
        String name = in.nextLine();

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
        }
    }
}
