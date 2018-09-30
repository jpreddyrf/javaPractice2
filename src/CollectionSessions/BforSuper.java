package CollectionSessions;

public class BforSuper extends AforSuper  {
	
	public BforSuper(){
		super(10);		// Inside constructor only one super keyword, its not allowed more than one super keyword
		System.out.println("This is Child Default Constructor ");
		System.out.println(" ");
	}
	
	public BforSuper(int a){
		super();		// Called parent Default constructor
		System.out.println("This is Child Single parameter Constructor ");
		System.out.println(" ");
	}
	
	public BforSuper(int a, int b){
		super(10,20);	// called parent two parameter constructor
		System.out.println("This is Child Doble parameter Constructor ");
		System.out.println(" ");
	}
	public BforSuper(int a, int b, int c){
		
		System.out.println("This is Child Trible parameter Constructor ");
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BforSuper obj= new BforSuper();
		BforSuper obj1= new BforSuper(10);
		BforSuper obj2= new BforSuper(10,20);
		BforSuper obj3= new BforSuper(10,20,30);
	}

}
