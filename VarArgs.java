public class VarArgs {
    static void method(int ...x){

        for (int i =0 ; i<x.length ; i ++){
            System.out.println(x[i]);
        }

        for(int i : x)
        System.out.println(i);
    }
    public static void main(String[] args) {
        method( 32,33,5,5,65,7,8,8);
        method( 32,65,7,8,8);
        method( 32,8,8);
        method( 32,33,5,5,8);
    }
    
}
