package Reusability;

public class Association1 {

    String name ;
    int salary ;
    Adress adr ;

    Association1( String name , int salary, Adress adr )
    {
        this.name= name ;
        this.salary = salary;
        this.adr = adr ;
    }

    void show()
    {
    System.out.println("name = "+name);
    System.out.println("salary"+salary);
    System.out.println("city= "+adr.city);
    System.out.println("state = "+adr.state);
    System.out.println("countery ="+adr.country);

    }

    public static void main(String aa[])
    {
        Association1 as =  new Association1("Dharam",3475,new Adress( "Blaghata","Madhyapradesh","India"));
        as.show();
    }
   
}

class Adress{
    String state ;
    String city  ;
    String country ;

    Adress(String state , String city , String country){
        this.state = state ;
        this.city = city;
        this.country =  country ;
    }

}