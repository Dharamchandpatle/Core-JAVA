public class ReferenceID {
    // i can change the id according to me in java
    public String toString(){
        return "1234567890";
    }
    public static void main(String[] args) {
        // Create a new instance of the class
        ReferenceID referenceID = new ReferenceID();
        System.out.println(referenceID);
        
    }
    
}


/*
 * Method of reference ID :=
 * public String toString(){
 * return getclass.getname()+ "@"+Integer.toHexaString(hashCode());
 * }
*/