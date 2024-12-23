package StaticBlock;

public class StudentSelectedInInterview {
    static String clgname , cmpname ;
    String name ;
    int roll , age ; 
    float salary ; 

    StudentSelectedInInterview( String n , String cl , String cm , int r , int a , float s ){
        name = n;
        clgname = cl;
        cmpname = cm ;
        roll = r ; 
        age = a ;
        salary = s ;
    }

    void show (){
        System.out.println(name );
        System.out.println(clgname );
        System.out.println(cmpname );
        System.out.println(roll );
        System.out.println(age );
        System.out.println(salary );
    }
    
    public static void main (String aa[ ]){
        StudentSelectedInInterview s = new StudentSelectedInInterview(" Dharamchand patle ", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        StudentSelectedInInterview s1 = new StudentSelectedInInterview(" Dharamchand patle1 ", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        StudentSelectedInInterview s2 = new StudentSelectedInInterview(" Dharamchand patle2 ", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        StudentSelectedInInterview s3 = new StudentSelectedInInterview(" Dharamchand patle3 ", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        StudentSelectedInInterview s4 = new StudentSelectedInInterview(" Dharamchand patle4 ", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        StudentSelectedInInterview s5 = new StudentSelectedInInterview(" Dharamchand patle5 ", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        StudentSelectedInInterview s6 = new StudentSelectedInInterview(" Dharamchand patle6", " IET DAVV ", "ZScaler ", 91 , 22 , 26.5f);
        s.show();
        s1.show();
        s2.show();
        s3.show();
        s4.show();
        s5.show();
        s6.show();
    }
}
