package Inheritance;

class inheritace1{
    int x = 10 ;
    
}
public class Inheritance extends inheritace1 {
    void show(){
        int x= 20 ;
        System.out.println("hello inheritance java "+x);
    }

    public static void main(String aa[]){
        Inheritance in = new Inheritance();
        in.show();
    }
    
}
