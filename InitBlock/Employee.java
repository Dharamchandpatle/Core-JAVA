// PRgram tha ki employee ki detail se pehle salary or address print hona chahiye 
package InitBlock;

public class Employee {
    String name ;
    int  age ;
    Address adr ;
    Salary slr ;
    
    {
        adr = new Address();
    }

    {
        slr = new Salary();
    }

    Employee(String n , int a ){
        name = n;
        age = a;
    }

    void show (){
        System.out.println(" NAme = "+ name );
        System.out.println(" Age = "+ age);
        System.out.println(" Adress = "+ adr.city + " " + adr.state +" "+ adr.country );
        System.out.println("Salary = "+ slr.total +" "+ slr.da +" "+ slr.hra);

    }

    public static void main ( String aa[]){
        Employee e = new Employee(" Dharam", 10);
        e.show();
    }
    
}
