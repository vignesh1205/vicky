package oobpart1;

public class statiaandnonstatic {
	String s="vicky";
	static int i=10;
	

	public static void main(String[] args) {
		age();
		statiaandnonstatic.age();
		
		statiaandnonstatic obj=new statiaandnonstatic();
	      obj.name();
	    
	}
	public void name() {
		System.out.println(s);
	}
	public static void age() {
		System.out.println(i);
	}

}
