package JavaPract;

public class WraperClass {
// data conversion using warper class
	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		// String to Integer Data Conversion 
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		// warper classes : Integer, Double, Character, Boolean
		
		//String to Double Data conversion
		String y= "1000.234";
		double j= Double.parseDouble(y);
		System.out.println(j+111.11);
		
		// String to boolean
		String s= "true";
		boolean c= Boolean.parseBoolean(s);
		System.out.println(c);
		
		// int to string 
		int x1=2000;
		String s1= String.valueOf(x1);
		System.out.println(s1+20);
		
		// double to String
		double d2=1000.001;
		String s2= String.valueOf(d2);
		System.out.println(s2);
		
	
		
		
		
		

	}

}
