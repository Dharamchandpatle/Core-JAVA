
public class ObjectTypeClass {
	String name , clgName , mobile;
	int age , id ; 
	void showInfo() {
		System.out.println("Name = "+ name );
		System.out.println("clgName = "+ clgName );
		System.out.println("mobile = "+ mobile );
		System.out.println("age = "+ age );
		System.out.println("Id = "+ id );
	}
	void chat() {
		System.out.println(" I am doing chating..........");
		
	}

	public static void main(String[] args) {
		System.out.println("This is print the reference ID .....................");
		//This is print the reference ID 
		System.out.println(new ObjectTypeClass());
		
		//This is Anonimous Object 
		System.out.println("This is Anonimous Object ..................");
		System.out.println(new ObjectTypeClass().clgName="DAVV Indore ");
		System.out.println(new ObjectTypeClass().name="Dharam The Programmer ");
		
		//This is Reference Type object 
		System.out.println(" This is Reference Type object .............");
		ObjectTypeClass t = new ObjectTypeClass();
		t.clgName="IET DAVV ";
		t.age =  21 ;
		t.mobile= "435739847598732" ;
		t.showInfo();
		
		
		// other type object 
		System.out.println("other type object .............");
		ObjectTypeClass t2 ;
		t2 = new ObjectTypeClass();
		t2.showInfo();
		t2.clgName="IET DAVV ";
		t2.age =  21 ;
		t2.mobile= "435739847598732" ;
		t2.showInfo();
		
		//ObjectTypeClass t3 ;
		ObjectTypeClass t3 = null; // es type se bhi ham object bna skte hai or eski null define kr skte hai 
		System.out.println(t3);

	}

}
