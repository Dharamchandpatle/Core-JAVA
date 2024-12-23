public class NonStaticDM {

    int x = 10 ;
    NonStaticDM(){
        System.out.println(x);
    }
    void show(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(new NonStaticDM().x);
        NonStaticDM r = new NonStaticDM();
        System.out.println(r.x);
    }
    
}
