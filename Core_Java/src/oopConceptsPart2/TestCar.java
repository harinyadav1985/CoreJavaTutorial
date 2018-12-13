package oopConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//Overriden method //Static(Compile) time polymorphism
		b.TheftSafety();
		b.refuel();
		b.engine();/*it is possible to get the methods in a class from the parent to parent class*/
		Car c = new Car();
		c.start();
		c.refuel();
		c.start();
		
		/*c.theftsafety(); theftsafety can't be access. Parent class Car cannot access the child Class BMW where theftsafety
		is defined.*/
		
		//Top Casting
		Car c1 = new BMW();//Dynamic(Runtime) Polymorphism.
		//Child class object can be referred by parent class reference variable
		
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftsafety(); theftsafety can't be access.
		
		
		/*down casting not allowed (BMW b = new Car();) 
		parent class cannot fit into child class reference variable*/
		BMW b1 = (BMW)new Car();//ClassCastException will be given during run time
	}}
