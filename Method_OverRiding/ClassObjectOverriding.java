package Method_OverRiding;

class Demo1{
    Demo1 show ()
    {
        System.out.println("Show 1 demo  ");
        return this;
    }
}
public class ClassObjectOverriding  extends Demo1{

    ClassObjectOverriding show ()
    {
        System.out.println("Show 2 Class Object Overriding  ");
        return this;
    }

    public static void main( String aa[]){
        ClassObjectOverriding b = new ClassObjectOverriding();
        b.show();
    }
}
