package JavaPract;

public class CallByValueCallByReference {

	public static void main(String[] args) {
		CallByValueCallByReference obj = new CallByValueCallByReference();
		int x=10;
		int y=20;
		int s= obj.sum(x, y);
		System.out.println(s);
		
	}

	public int sum(int a,int b){
		int c= a+b;
		return c;
		
	}
}
