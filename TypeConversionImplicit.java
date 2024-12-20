// package Dharam;

public class TypeConversionImplicit {

		static void show(byte b) {
			System.out.println("Byte = " +b);
		}
		static void show(short b) {
			System.out.println("short = " +b);
		}
		static void show(int b) {
			System.out.println("int = " +b);
		}
		static void show(long b) {
			System.out.println("long = " +b);
		}
		static void show(float b) {
			System.out.println("float = " +b);
		}
		static void show(double b) {
			System.out.println("double = " +b);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(23);
		show(23L);
		show ((byte)(23));

	}

}
