package JavaPract_Part2;

// is -a Relationship
// multiple inheritence
public class InterfaceHSBC implements InterfaceUsBank, InterfaceBrazilBank {

	
	// If class is implements Interface then its mandatary implement/define/override all methods of Interface
	@Override
	public void credit() {
		System.out.println("Hsbc--- Credit In US Bank");
		
	}

	@Override
	public void debit() {

		System.out.println("Hsbc ---- Debit In US Bank");
	}

	@Override
	public void transferMoney() {

		System.out.println("Hsbc ---- Transfer Money In US Bank");
		
	}
	

	public void carLoan(){
		System.out.println("Hsbc ---- Car Loan");
	}
	
	public void homeLoan(){
		System.out.println("Hsbc --- Home Loan");
	}
	
	int k = min_bal+100;

	@Override
	public void mutualFund() {

		System.out.println("Hsbc --- mutualfund In Brazil Bank ");
		
	}

	@Override
	public void trading() {

		System.out.println("Hsbc ----- Trading in BrazilBank");
	}
}
