package Static$NonStatic;
// this program to call Non Static data member and member function 

public class StaticDM_MF {
    static int a = 10;

    // int a = 10;

    static void dharam() {

        // Agar se mera data member non static hai or mai usko static member function me
        // call krunga to error aayegi .
        // System.out.println(a);

        System.out.println(a);
        System.out.println("Hello ji this is a static member function ");
        System.out.println("this is a static data  mamber ");

    }

    StaticDM_MF() {
        System.out.println(" static member function " + a);
        dharam();
    }
// Direct calling 
    void ram() {
        dharam();
    }

    public static void main(String aa[]) {
        // object
        System.out.println(new StaticDM_MF().a);
        new StaticDM_MF();

        // direct
        System.out.println(a);
        dharam();

        // by class
        System.out.println(StaticDM_MF.a);
        StaticDM_MF.dharam();

        // bye reference 
        StaticDM_MF m = new StaticDM_MF();
        m.ram();
        m.dharam();



    }
}
