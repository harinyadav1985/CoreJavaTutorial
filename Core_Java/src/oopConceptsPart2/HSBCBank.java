package oopConceptsPart2;

public class HSBCBank implements USBank, BrazilBank { //multiple inheritance achieved 
	// if a class in implementing an interface then it is mandatory to implement all the methods in the class.
	// has a relationship means class to class relationship using extend keywords
	// is a relationship mean class to interface relationship using implements keyword.
	
		public void credit(){
			System.out.println("HSBC credit ");
		}
		public void debit(){
			System.out.println("HSBC debit");
		}
		public void transferMoney(){
			System.out.println("transfer money");
		}
		public void carLoan(){
			System.out.println("carLoan");
		}
		public void homeLoan(){
			System.out.println("carLoan");
		}
		public void mutualFund(){
		System.out.println("Brazil Mutual fund");
		}
}


