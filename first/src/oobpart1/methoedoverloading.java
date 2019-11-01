package oobpart1;

public class methoedoverloading {

	public static void main(String[] args) {
		
		methoedoverloading obj= new methoedoverloading();
		obj.sum());
		obj.sum(10);
		obj.sum("vicky");
	}
	public void sum() {
		System.out.println("first methoed");
		
		
	}
	public void sum(int i) {
		System.out.println("second methoed");
		System.out.println(i);
	}
	public void sum(String s1) {
		System.out.println("thired mwthoed");
		System.out.println(s1);
	}

}
