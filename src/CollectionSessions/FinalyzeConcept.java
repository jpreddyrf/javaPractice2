package CollectionSessions;

public class FinalyzeConcept {

	// Finalize ia a method concept is just cleanup the objects
	// finally is a block
	// final is keyword
	public void finalize(){
		System.out.println("Finalyze method body");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Finalyze concept is used to clear memory in garbage collection
		
		FinalyzeConcept f1= new FinalyzeConcept();
		FinalyzeConcept f2= new FinalyzeConcept();
		
		f1=null;  // no object refference
		f2=null; // no object refference
		
		System.gc(); // call the garbage collector

	}

}
