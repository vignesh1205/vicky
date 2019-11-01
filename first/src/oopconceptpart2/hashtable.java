package oopconceptpart2;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {

		Hashtable h =new Hashtable();
		h.put(1, 1000);
		h.put(2, "vicky");
		h.put(3, "value");
		System.out.println(h.get(3));
		System.out.println(h.size());
		for(int i=0; i<=h.size();i++) {
			System.out.println(h.get(i));
		}
		
	}

}
