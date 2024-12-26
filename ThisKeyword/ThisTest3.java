package ThisKeyword;

public class ThisTest3 {
    ThisTest3 show(){
        System.out.println(" Shoe ");
        return this ;
    }

    
    ThisTest3 disp(){
        System.out.println(" Shoe ");
        return this ;
    }

    ThisTest3 disp1(){
        System.out.println(" Shoe ");
        return this ;
    }

    ThisTest3 disp3(){
        System.out.println(" Shoe ");
        return this ;
    }

    public static void main ( String aa[]){
        new ThisTest3().show().disp().disp1().disp3();
    }


    
}
