package Patterns;

public class hollows {
    public static void main ( String aa[]){
      
        for (int i = 1  ; i<= 4 ; i++){
            for (int j = 1 ; j<= 5 ; j++){
                // ceil (i,j)
                if(i == 1 || j == 1 || i==4 || j==5){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
}