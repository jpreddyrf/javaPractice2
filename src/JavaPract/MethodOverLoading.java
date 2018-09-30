package JavaPract;

public class MethodOverLoading {
// Method over loading is method name is same with different input parameters with in the class
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.first();
		obj.first(100.05);
		obj.first(25);
		obj.first("This is the sring one argument");
		obj.first(77, 88);
		obj.first(10000, "Two parameter passing one int and one String");

	}
	
	public void first(){
		System.out.println("First method withod arguments ");
	}
	public void first(int a){
		System.out.println("First method with one int argument  "+a);
		
	}
	public void first(String a){
		System.out.println("First method with one String argument "+a);
	}
	public void first(double d){
		System.out.println("First method with one double argument "+d);
		
	}
	public void first(int a, int b){
		System.out.println("First method with two int arguments a and b "+a +b);
	}
	public void first(int x, String y){
		System.out.println("First method with two parameters int and String  "+x +y);
	}
	
}
