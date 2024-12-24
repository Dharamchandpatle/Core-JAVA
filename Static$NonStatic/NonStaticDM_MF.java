package Static$NonStatic;
// this program to call Non Static data member and member function 
public class NonStaticDM_MF {
    int a = 10 ;
    void show(){
        // Direct calling 
        System.out.println("THis is non static Data member  "+a);
        System.out.println("THis is non static member fuction ");
        
    }

    NonStaticDM_MF(){
        
        System.out.println(a);
        show();
    }

    // direct calling 
    void disp(){
       
        show();
    }

    public static void main(String aa[]){

        // by object
        System.out.println(new NonStaticDM_MF().a);
        new NonStaticDM_MF();

        // By reference 
        NonStaticDM_MF m = new NonStaticDM_MF();
        m.show();
        System.out.println(m.a);
        m.disp();




    }
}
