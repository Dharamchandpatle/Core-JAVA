package Static$NonStatic;
public class Static_NonStaticUseAnywhere {
    public static void main(String aa[]){
          // object
          System.out.println(new StaticDM_MF().a);
          new StaticDM_MF();
  
          //  direct method cant bhi use other class .
          // direct
        //   System.out.println(a);
        //   dharam();
  
          // by class
          System.out.println(StaticDM_MF.a);
          StaticDM_MF.dharam();
  
          // bye reference 
          StaticDM_MF m = new StaticDM_MF();
          m.ram();
          m.dharam();
  
    }
}
