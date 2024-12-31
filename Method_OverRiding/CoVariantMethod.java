
// Covariant metho : - Before jdk1.5 we are not able to override method by changing th return type but from jdk 1.5 iit is paossible to override a method by changing the return type .

package Method_OverRiding;

class B{

}

class C extends B{

}

class Base {
    B show(){
        System.out.println(" This is covarient method base ");
        return new B();
    }
}

public class CoVariantMethod extends Base{
    C show(){
        System.out.println(" This is covarient method base1 ");
        return new C();
    }

    public static void main(String aa[]){
        CoVariantMethod c = new CoVariantMethod();
        c.show();
    }
}



