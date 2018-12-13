package oopConceptsPart2;

public class BMW extends Car{

	/*when method is present in parent as well as in child class with the same name and same number of
	Argument and trying to get the method value then method value will be from the child class and this process
	 is called as method overriding.*/
	public void start(){
		System.out.println("Autometic Car Start");
	}
	public void TheftSafety(){
		System.out.println("Car is Theft Safe ");
	}
}
