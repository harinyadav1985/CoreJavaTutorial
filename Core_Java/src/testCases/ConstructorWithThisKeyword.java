package testCases;

public class ConstructorWithThisKeyword {
	//Class(Global) variable
	String name;
	int age;

	public ConstructorWithThisKeyword(String name , int age){ //local variable name an age
		System.out.println(name);
		System.out.println(age);
		/*This keyword is used to initialize the class variable in the constructor 
		with the current value in constructor*/
		this.name = name; 
		// this.name is referring global variable name 
		// name is referring local variable
		
		this.age = age;
	}
	
	public static void main(String args[]){
	
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("hari" ,30);
}
}
