package Encapsulation;

import java.util.Scanner;

public class Test {

    public static void main(String aa[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name - ");
        String name  = in.next();

        System.out.print("Enter password : ");
        String pass = in.next();

        //Login login = new Login();
        Login login = new Login(name,pass);

        login.setName(name);
        login.setPass(pass);

        System.out.println(login.getName() + "   " + login.getPass());

        String msg = Validation.validate(login);
        if(msg.equals("valid")){
            System.out.println("Welcom = "+ login.getName());
        }
        else{
            System.out.println("Failed..");
        }

    }
    
}
