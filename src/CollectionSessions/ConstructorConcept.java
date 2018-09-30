package CollectionSessions;

public class ConstructorConcept {
	// Constructor name same as a Class Name,
	// Constructor looks like a function but it not a function
	// Constructor have no return type (void, int, string etc..)
	// Constructor can over Load ***
	// calling constructor : when object is created automatically call the constructor
	public ConstructorConcept(){
		// this is default constructor (no passing any parameters/input)
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorConcept(int i){
		System.out.println("Single parameter constructor ");
		System.out.println("the value of i is "+i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("Two Parameter Constructor");
		System.out.println("the value of i is "+i);
		System.out.println("the value of j is "+j);
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		ConstructorConcept obj= new ConstructorConcept(); // default constructor
		ConstructorConcept obj1= new ConstructorConcept(10);
		ConstructorConcept obj2= new ConstructorConcept(20,30);
		
	}

}
