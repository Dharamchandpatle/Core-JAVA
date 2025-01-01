package Method_OverRiding;

class Demo11{
    public void show (int x )
    {
        System.out.println("Show of dempo "+x);
        
    }
    public void show1 (int y , int z)
    {
        System.out.println("Show 1 demo  "+y);
        System.out.println("Show 1 demo  "+z);

    }
}
public class MethodOverriding1 extends Demo11 {
   
    public void show1 (int y , int z)
    {
        System.out.println("Show 1 MethodOverriding1  "+y);
        System.out.println("Show 1 MethodOverriding1  "+z);

    }
    public void show (int x )
    {
        System.out.println("Show 1 MethodOverriding1  "+ x);

    }

    public static void main(String aa[]){
        MethodOverriding1 d = new MethodOverriding1();
        d.show(10);
        d.show1(200, 300);
    }
}
