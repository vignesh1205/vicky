package first;

public class arrayconceot {

	public static void main(String[] args) {
		
		int i[] = new int[6];
		i[0]=50;
		i[1]=40;
		i[2]=30;
		i[3]=20;
		i[4]=10;
		System.out.println(i.length);
		System.out.println("#######");
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
        double d[] = new double[3];
        d[0]=12.44;
        d[1]=19.01;
        d[2]=5.12;
        System.out.println(d[1]+i[2]);
         
        Object ob[] = new Object[5];
        ob[0]= 51;
        ob[1]= "vicky";
        ob[2]= 51.45;
        ob[3]='m';
        ob[4]="kottur";
        for(int j=0;j<ob.length;j++) {
        	System.out.println(ob[j]);
        }
        
        
	
	
	
        		
        
        		
 	}

}
