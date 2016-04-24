package oca.examples.chap2;

public class Operators {
	
	public static void compoundAssignmentOperators() {
		long x = 10;
		int y = 5; 
//		y = y * x; // cannot convert from long to int		
		y *= x;
		
		long y1 = (x = 4); // x = 4, y1 = 4;
		if (null == null) {
			System.out.println("null is null");
		}
	}
	
	public static void incrementOperator() {
		int i = 1;
		System.out.println(i++); // i = 1
		System.out.println(i);   // i = 2
		
		i = i++;
		System.out.println(i); // i = 2
		
		i = ++i;
		System.out.println(i); // i = 3
	}
	
	public static void main(String... ass) {
		incrementOperator();
//		compoundAssignmentOperators();
	}
}
