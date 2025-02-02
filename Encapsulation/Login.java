package Encapsulation;

import java.io.Serializable;

public class Login implements Serializable {
    private String name , pass ;

     Login (String name2 , String pass2 ){
        this.setName(name2);
        this.setPass(pass2);
    }

    //setter............
    public void setName(String name ){
        this.name = name ;
    }

    // Gatter.... 
    public String getName(){
        return name ;
    }

    public void setPass (String pass){
        this.pass = pass ;
    }

    public String getPass(){
        return pass ; 
    }



    
}
