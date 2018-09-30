package JavaPract_Part2;

public interface InterfaceUsBank {
	int min_bal = 100;
	public void  credit();
	public  void debit();
	public void transferMoney();
	
 // Only method declaration;
	// No method body -- only method prototype
	// no main method
	//In Interface we can declare variables, variables by default static in nature and its value final--(not changed)
	// we can't create object of interface
	// No static method in interface
	// Interface is abstract in nature
}
