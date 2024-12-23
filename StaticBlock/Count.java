package StaticBlock;

public class Count {
    // static int count ; // op : 1 2 3 4 5 6 7 8  reason is  allocat ClassArea loading memory 
     int count ; //  1 1 1 1 1 1 1  Reason is allocate in heap memory 
    
    Count(){
        count ++;
        System.out.println(count);
    }
    public static void main(String aa []){
        new Count() ;
        new Count() ;
        new Count() ;
        new Count() ;
        new Count() ;
        new Count() ;
    }
}
