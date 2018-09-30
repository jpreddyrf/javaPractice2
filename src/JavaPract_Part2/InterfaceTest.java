package JavaPract_Part2;

public class InterfaceTest {
	
	public static void main(String arg[]){
		InterfaceHSBC hb= new InterfaceHSBC();
		hb.carLoan();
		hb.credit();
		hb.debit();
		hb.homeLoan();
		hb.transferMoney();
		hb.trading();
		hb.mutualFund();
		System.out.println(hb.min_bal+100);
		
		System.out.println(InterfaceUsBank.min_bal); // we can access interface value using Interface name.variableName
		System.out.println(InterfaceHSBC.min_bal);  // or implemented className.interfacevariableName
		
	
	
	}
	

}
