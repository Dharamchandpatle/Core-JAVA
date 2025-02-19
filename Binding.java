class parent {
    int x = 10 ;
    static int y= 10 ;

    parent(){
        System.out.println("This is constructor of parent ");
    }

    void show(){
        System.out.println("This is show method");
    }
     static void disp(){
        System.out.println("This is disp method of parent ");
    }
}
public class Binding extends parent {

    int x = 100 ;
    static int y= 200 ;

    void show(){
        System.out.println("This is show method of binding ");
    }

    static void disp(){
        System.out.println("This is disp method of binding ");
    }

    Binding(){
        System.out.println("This is constructor of Binding ");
    }


    public static void main(String aa [])
    {
    //    parent p = new Binding();
    //    System.out.println(p.x);
    //    p.show();
    //    p.disp();

    try {
        Class c = Class.forName(aa[0]);
        parent d = (parent)c.newInstance();
        System.out.println(d.x);
        System.out.println(d.y);
           d.show();
           d.disp();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
