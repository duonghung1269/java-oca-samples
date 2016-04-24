package oca.examples.chap2;

public class JavaStatements extends Operators {

	public void switchStatement(final int day) {
		int dayOfWeek = 5;
		final int MONDAY = 1;
		int TUESDAY = 2;
		switch (dayOfWeek) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("EOROEROEROROOR");
			break;
		case day:
			System.out.println("Errororororoor");
			break;
		case 2:
			System.out.println("Tuesday");
		break;
		default: 
			System.out.println("Weekend");
			break;
		}
		
		switch (1) {
		
		}
	}
	
	public void forStatement() {
//		int x = 0;
//		for (int y = 0, x = 4; x < 5 && y < 10; x++, y++) { // Re-declare x
//			
//		}
		
		for (int y = 0, long x = 4; x < 5 && y < 10; x++, y++) {
			
		}
	}
	
	public void forEachStatement() {
		String[] names = new String[3]; // initialize with 3 null pointer values
		for (String name : names) {
			
		}
	}
	
	public static void breakStatement() {
		HAHA: for (int i = 0; i < 10; i++) {
			for (int j = 10; j < 20; j++) {
				if (j == 15) {
					break HAHA;
				}
				
				System.out.println("i = " + i + ", j = " + j);
			}
		}
	
		System.out.println("out ");
	}
	
	public static void continueStatement() {
		HAHA: for (int i = 0; i < 10; i++) {
			for (int j = 10; j < 20; j++) {
				if (j == 15) {
					continue HAHA;
				}
				
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		
		System.out.println("out ");
		HEHE: {
			int x = 1;
		}
	}
	
	public static void main(String... adg) {
//		breakStatement();
		continueStatement();
	}
}
