// public package Dharam;

public class TypeConversionExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 10 ;
		byte b3 = 120 ;
		
		byte b2 = 10 ;
		byte b4= 10 ;
		
		byte c = (byte)(b1+b3);// this is right method of appling arithmatic operation .
		
		byte c1 = (byte)(b2+b4);
		
		//int c = b1 + b3 ;//answer to aayega par ye galat tarika hai kyuki int ka size 4 hota hai or byte ka 2 hame byte  ka byte me hi karna hai .
		System.out.println(c);
		System.out.println(c1);
		
		// For :- Interview purpose .... [b++ , b=b+1]
		byte b = 10 ;
		b++;
		System.out.println(b);
		
		// b = b+1 ;// Esme byte ko or integer no ko add kar rhe h jo byte me possible nhi hai so this is compile time error ..
		
		b = (byte)(b+1);
		System.out.println(b);
		
		// IMportance of type casting Que. find the ratio
		
		int male = 2 ;
		int female = 3 ;
		//int ratio = male/female; // outpout to aayega par exact nhi aayega 
		float ratio = (float)male/female ; // float ratio = (float)(male/female ); ye galat hai 
		System.out.println(ratio);
		

	}

}
