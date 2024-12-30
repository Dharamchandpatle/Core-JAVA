package Reusability;

class Example {
    
    int x =10 ;

    void show ()
    {
        System.out.println(" value of x = "+x);
    }
}

class main{
    public static void main (String aa[])
    {
        Example e = new Example();
        e.show();
    }
}