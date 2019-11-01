package oopconceptpart2;

public class testbank {

	public static void main(String[] args) {
		
		
	System.out.println(USBank.min_bal);	
		
		
		USBank u =new HDFCBank();
		
		u.cridit();
		u.debit();
		u.transfer();
		System.out.println("##########");
		
		HDFCBank hf = new HDFCBank();
		hf.cridit();
		hf.debit();
		hf.transfer();
		hf.loan();
		hf.overdft();
		
		
		
		
		
	}

}
