package oopConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		
		// USBank ub = new USBank(); will through error "Cannot instantiate the type USBank" bcz USBank is an interface here. 
		HSBCBank hsbc = new HSBCBank();
		hsbc.credit();
		hsbc.carLoan();
		hsbc.debit();
		//dynamic polymorphism
		//child object can be referred by parent interface reference variable
		USBank b = new HSBCBank();
		// only overwritten methods will be called
		// cannot access the methods created in HSBCBank and not in interface class
		b.credit();
		b.debit();
		b.transferMoney();
		
		/*System.out.println(minBalance); cannot access variable of interface direclty, we  need to access 
		by either class/interface name
		*/
		System.out.println(USBank.minBalance);
		System.out.println(HSBCBank.minBalance);
		//USBank.minBalance =400; the variable defined in interface cannot be reassigned/changed in the class which is implementing interface
		
	}

}
