package JavaPract_Part2;

public class InheritenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inheritence child class extends to parent class: child object calls parent as well as child methods");
		BMW b= new BMW();
		
		// " Static polymorphism or Compile time polymorphism "
		b.antiTheft(); // parent method
		b.start(); // child as well as parent but it calls child method only
		b.refill(); // child method
		b.stop();
		b.engine();
		b.body();
		
		System.out.println("____________________________________");
		
		System.out.println("Parent Calass Object");
		Car c = new Car();
		c.start(); 
		c.stop();
		c.antiTheft();
		System.out.println("____________________________________");
		
		// Top Casting
		// " Dynamic polymorphism or Run time polymarphism "
		System.out.println("Child class object reffered by Parent Class reference Variable");
		Car c1= new BMW();
		c1.antiTheft();
		c1.start();
		c1.stop();
		System.out.println("____________________________________");
		
		
		// Down casting
		BMW b1= (BMW)new Car(); //runtime error
		
		
		
		
		
		
		
	}

}
