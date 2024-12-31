// Method overriding use only for over ride the property of parent class  . child class overrides the parent class property . 
package Method_OverRiding;


class Demo{
    void show(){
        System.out.println("This is demo ");
    }
}

class Demo1 extends Demo{
    void show(){
        super.show(); // For parent class show method calling 
        System.out.println("This is demo1 ");
    }
}

class Demo2 extends Demo1 {
    void show(){
        super.show(); // For parent class show method calling 
        System.out.println("This is demo2 ");
    }
}
public class MethodOverriding extends Demo2{
    void show()
    {
        super.show(); // For parent class show method calling 
        System.out.println("This is main ");
    }

    public static void main ( String aa[]){
        MethodOverriding m = new MethodOverriding();
        m.show();
    }
}
