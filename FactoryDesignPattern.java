
 class A {
	static B getObject () {
		B b = new B() ;
		System.out.println(b);
		return b ;
	}
}
	class B {
		B(){
			System.out.println("B is constructor ....");
		}
	}
	
	public class FactoryDesignPattern { 
	public static void main(String[] args) {
		B b = A.getObject();
;
		System.out.println(b);

	}

}
