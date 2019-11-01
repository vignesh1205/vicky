package oopconceptpart2;

public class HDFCBank implements USBank,ICICBank {
	
	public void cridit() {
		System.out.println("HFBank----cridit");	
	}
	
	public void debit() {
		System.out.println("hFBank-----debit");
	}
	
	public void transfer() {
		System.out.println("HFBamk-----transfer");
	}
	
	public void loan() {
		System.out.println("HF---carloan");
		System.out.println("HF-----homeloan");
	}
	
	public void overdft() {
		System.out.println("HF----overdft");
	}
}
