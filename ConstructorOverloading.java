public class ConstructorOverloading{
    ConstructorOverloading(){
        System.out.println("ConstructorOverloading");
    }

    ConstructorOverloading(int a ){
        System.out.println(a);

    }
    ConstructorOverloading(int a , int b ){
        System.out.println(a  + " "+ b);

    }
    ConstructorOverloading(String car , ConstructorOverloading a ){
        System.out.println(car);
        System.out.println(a);
    }

    public static void main (String args[]){
        // ConstructorOverloading co = new ConstructorOverloading();
       new  ConstructorOverloading();
       new ConstructorOverloading( 10);
       new ConstructorOverloading(11,22);
       new ConstructorOverloading("car" ,  new ConstructorOverloading());




    }

}