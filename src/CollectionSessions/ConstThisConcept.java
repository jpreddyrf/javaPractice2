package CollectionSessions;

public class ConstThisConcept {

	// Global variables/Class variable
	String name="venkat";
	int age=40;
	
	public ConstThisConcept(String name, int age){ 		//Local variable/method variables
		this.name=name;									// this.<GlobalVariable> = <LocalVariable>
		this.age=age;
		System.out.println("Name of person "+this.name);
		System.out.println("Age of person  "+this.age);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ConstThisConcept obj= new ConstThisConcept("Naveen",30);
	}

}
