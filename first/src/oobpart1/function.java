package oobpart1;

public class function {

	public static void main(String[] args) {
		function obj= new function();
		obj.first();
		
		int d=obj.sec();
		System.out.println(d);
		
		String e= obj.thi();
		System.out.println(e);
		
		

	}

	public void first() {
		System.out.println("first methoed");
	
	}
	public int sec() {
		System.out.println("second methoed");
		int a=10;
		int b=22;
		int c=a+b;
		return c;		
		
	}
	public String thi() {
		System.out.println("thired methoed");
		String s= "learn java";
		return s;
	}
}
