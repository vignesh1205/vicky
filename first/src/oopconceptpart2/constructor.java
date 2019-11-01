package oopconceptpart2;

public class constructor {
	
	
	public constructor() {
		System.out.println("defult constructor");
	}
	
	public constructor(int i) {
		System.out.println("one perameter cons i" +i);
		
	}
	 public constructor(int i,int j) {
		 System.out.println("tow perams cons i" +i);
		 System.out.println("tow perams cons j" +j);
	 }
	

	public static void main(String[] args) {
		constructor obj = new constructor();
		constructor obj1 = new constructor(10);
		constructor obj2 = new constructor(10,20);
		
		

	}

}
