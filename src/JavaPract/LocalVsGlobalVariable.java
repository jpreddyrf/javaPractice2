package JavaPract;

public class LocalVsGlobalVariable {
//global variables non static
	int age=25;
	String name ="tom";
	public static void main(String[] args) {
		int i=10; // local variables
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.sum();
		System.out.println(i);
				
	}
	
	public void sum(){
		int i=15; // local variable for sum method
		int j=20; // local variable
		int age=25; // local variable
		System.out.println("Printing of Sum method local variables"+i +j  +age);
	}

}
