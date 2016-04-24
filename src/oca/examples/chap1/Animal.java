package oca.examples.chap1;

/**
 * Can have multiples class inside .java file
 * If has public class, then it should match filename
 * Only most 1 class is allow to be public, allow no class is public
 * Animal.java can only has class Animal2
 * @author duonghung1269
 *
 */

import java.util.*;
import java.sql.Date;
public class Animal {
	public static void main(String[] arg) {
//		Date s = new Date(1213);
		System.out.println("hahah");
		
		int   i = 1.0;         // cannot convert from double to int
		short s = 1922222;     // cannot convert from int to short
		float f = 124.3;       // cannot convert from double to float
		long  l = 12345678901; // The literal 12345678901 of type int is out of range
		
		// Fixed
		int   i1 = 1;
		short s1 = 192;
		float f1 = 124.3f;
		long  l1 = 12345678901L;
		byte b = 127;
		b = ++b;
		
		
	}
}

class Animal2 {
	
}
