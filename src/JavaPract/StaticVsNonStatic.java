package JavaPract;

public class StaticVsNonStatic {

	String Name = "tom";  // Non static global variable
	static int age =25;   // Static global variable
	public static void main(String[] args) {
		
		sum();
		StaticVsNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticVsNonStatic.age);
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.send();
	//	obj.sum(); // Static method also access through obj
		System.out.println(obj.Name);
		
	
	}
	
	public void send(){                  // Non static method
		System.out.println("Send mail method ");
	}
	
	public static void sum(){   // Static method
		System.out.println("Static Method");
		
		
	}

}
