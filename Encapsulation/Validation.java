package Encapsulation;

public class Validation {
    
    public static String validate (Login login){
        if(login.getName.equals("admin") && login.getPass.equals("admin")){
            return "Valid";
        }
        else
        return "Invalid";
    }
    
}
