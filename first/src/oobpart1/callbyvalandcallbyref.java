package oobpart1;

public class callbyvalandcallbyref {
int p;
int q;
	public static void main(String[] args) {
		
		callbyvalandcallbyref obj= new callbyvalandcallbyref();
		
		
		
		
		int x= 10;
		int y= 22;
		int i=obj.sum(x,y );
		 System.out.println(i);
		
		obj.p=45;
		obj.q=76;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
	}
	public int sum(int a, int b) {
		a= 30;
		b= 35;
	int c=a+b;
	 return c;
	 
	 
	}
	public void swap(callbyvalandcallbyref t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
		
	}
	
	
	
	
}
