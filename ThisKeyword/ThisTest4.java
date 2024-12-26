package ThisKeyword;

public class ThisTest4 {
    ThisTest4(){
        this(10);
        System.out.println("Default const");
    }
    
    ThisTest4(int x){
        this(1000, 2000 );
        System.out.println(x);
    }
    
    ThisTest4(int x , int y){
        System.out.println(x + " "+ y);
    }

    public static void main ( String aa[]){
        new ThisTest4();
    }
    
}
