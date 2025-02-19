class Base {
    // public static void show()
    public  void show()
    {
        System.out.println("This show method of Base");
    }

    public static void invoke(Base b){
        b.show();;
    }
}

public class StaticAndDynamic extends Base {
    // public static void show(){
    public  void show(){
        System.out.println("This show method of Child");
    }

    public static void main(String aa[]){
        Base b = new Base();
        StaticAndDynamic s = new StaticAndDynamic();

        Base.invoke(b);
        Base.invoke(s);
    }
    
}
