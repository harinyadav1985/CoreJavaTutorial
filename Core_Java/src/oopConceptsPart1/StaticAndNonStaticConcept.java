package oopConceptsPart1;

public class StaticAndNonStaticConcept {
/*	scope of global variable will be available across all the function with some condition, if it is a static
	it can be access directly or by class name and it is non-static then we need to make object of the class
	and then we can access using . operator*/
	String name ="Jim Carry";
	static int age =10 ;
public static void main(String args[]){
	// static method and variables are not pass to object
	//how to call static methods? 
	// one way is directly calling
	sum();
	//calling by class name
	StaticAndNonStaticConcept.sum();
	//how to call static vars?
	//1. directly call or 2. calling by classname.variable name
	System.out.println(age);
	System.out.println(StaticAndNonStaticConcept.age);
	//calling non-static methods and variables
	StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
	obj.sendMail();
	System.out.println(obj.name);
	//static method and variables are not part of object but object have access on this static method and variable
// Can I access static method by using object? yes we can object reference
	obj.sum();//warning will be given. it should be access in static way
}
public void sendMail(){
	System.out.println("send mail method");
}
public static void sum(){
	System.out.println("Sum Method: ");
}
}
