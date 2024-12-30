
// In this program i have learned use of Super keyword ,  Upcasting , downcasting and typecasting .

package Inheritance;

class Pardadaji{
    int x = 200 ;
}
class Dadaji extends Pardadaji{
    int x = 100 ;
}
class Base1 extends Dadaji{
    int x = 10 ;
}

public class Inheritance1 extends Base1 {
   int x = 49 ;

   // This is UpCasting ............
//    void show (Base1 t1 , Dadaji t2 , Pardadaji t3 )// This is UpCasting 
//    {
//     System.out.println(x);
//     System.out.println(super.x);// this is Super 
//     System.out.println(t1.x);
//     System.out.println(t2.x);
//     System.out.println(t3.x);
//    }

   // TypeCasting ......

   void show ( ) 
   {
    System.out.println(((Base1)this).x);
    System.out.println(((Dadaji)this).x);
    System.out.println(((Pardadaji)this).x);
    System.out.println(x);
   }

   public static void main( String aa [])
   {
      Inheritance1 in = new Inheritance1();
    //   in.show(in, in, in);
      in.show();
   }
}
