// public package Dharam;
import java.util.Scanner;

public class Class42 {
	String name , clgname , mobile ;
	int age , id ; 
	void show() {
		System.out.println("name ="+ name );
		System.out.println("CLg name = "+ clgname );
		System.out.println(" mobile = "+ mobile);
		System.out.println(" Id ="+ id );
	}
	
	void getData(String n , String clg , String m , int a , int i  ) {
		name = n ;
		clgname =clg;
		mobile = m ;
		age = a ;
		id = i ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your details : ");
		System.out.println("  ");
		
		System.out.println("Enter your name : ");
		String n = sc.next();
		
		System.out.println(" Enter your clg name : ");
		String s = sc.next();
		
		System.out.println(" Enter your mobile number : ");
		String m = sc.next();
		
		System.out.println("Enter your age :");
		int a = sc.nextInt();
		
		System.out.println("Enter your id : ");
		int i = sc.nextInt();
		
		Class42 c = new Class42();
//		c.name = "Dharamchand patle ";
//		c.clgname = " IET DAVV";
//		c.mobile ="345389475";
//		c.age = 21 ;
//		c.id = 91 ;
//		c.show();
		
//		c.getData("Dharamchand patle ", "IET DAVV", "6546654654", 52, 54);
		c.getData(n, s, m, a, i);
		c.show();
		

	}

}
