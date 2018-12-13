package testCases;

public class FinallyConcept {
public static void main(String args[]){
//test1();
	FinallyConcept fc = new FinallyConcept();
	//fc.test2();
	fc.division();
}
// with static keyword call method directly without making object of the methods 
public static void test1(){
	try{
	System.out.println("inside test1 method");
	throw new RuntimeException("test1");
	}
	catch(Exception e){
		System.out.println("inside catch bolck");
	}
	/*finally is a block. it is executed after try catch block and any exception does not matter for it 
	and it wll be exceuted in any case.*/
	finally{
		System.out.println("inside final block");
	}}
	public static void test2(){
		try{
		System.out.println("inside test1 method");
		//throw new RuntimeException("test1");
		}
		finally{
			System.out.println("inside final block");
		}}
		public void division(){
			int i=10;
			try{
				System.out.println("inside try block");
				int k =i/0;
			}
			
			catch(Exception e){
				System.out.println("inside catch block");
				System.out.println("divide by zero error");
			}
			finally{
				System.out.println("execute this block even after exception");
			}
		}
	}

