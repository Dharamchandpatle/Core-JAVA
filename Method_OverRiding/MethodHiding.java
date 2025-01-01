package Method_OverRiding;


class Demo2 {
    public static void show (){
        System.out.println("Demo2 is showing ");
    }
}
public class MethodHiding extends Demo2 {
    public static void show (){
        System.out.println("method hidding  in overriding ");
    }

    public static void main(String aa []){
        MethodHiding d = new MethodHiding();
        d.show();
    }
}
