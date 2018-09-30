package JavaPract;

public class Functions {

	public static void main(String[] args) {
		Functions obj = new Functions();
		obj.test();
		int e=obj.sqr();
		String se=obj.qa();
		double d=obj.div(100, 10);
		
		System.out.println("Return values ------------");
		System.out.println("squaire :"+e);
		System.out.println("qa :"+se);
		System.out.println("div : "+d);
	}
		public void test(){
			System.out.println("This is test method");
			
		}
		public int sqr(){
			int a= 10;
			int c=a*a;
			System.out.println("Squaire of the 10 is "+c);
			
			return c;
		}

		public String qa(){
			System.out.println("qa Selenium");
			String s="Selenium";
			return s;
		}
		public double div(int x, int y){
			
			double z= x/y;
			System.out.println("x divide by y is: "+z);
			return z;
		}
	

}
