package Patterns;

public class hollow{
    public static void main(String aa[]){
        int n = 5 ;
        // outer loop 
        // for (int i = 1 ; i<= n ; i++){
        for (int i = n ; i>= 1 ; i--){

            // Inner loop 
            for(int j=1 ; j<= i  ; j++){
                System.out.print("*");
            }
        System.out.println();

        }
    }
}