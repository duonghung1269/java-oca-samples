package oca.examples.chap3;

public class ManipulateStrings {
	
	public void substringMethod() {
		String animals = "animals";
		
		System.out.println(animals.substring(3)); // mals
		System.out.println(animals.substring(3, 3)); // empty string
		System.out.println(animals.substring(3, 4)); // m
		System.out.println(animals.substring(3, 7)); // mals
		System.out.println(animals.substring(3, 8)); // throws Exception
		System.out.println(animals.substring(3, 2)); // throws Exception
	}
}
