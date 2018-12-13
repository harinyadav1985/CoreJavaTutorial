package testCases;

public class B extends A {
	public B(){
		// super is always first statement in a constructor and always written in child class constructor 
		super();
		//super(50); 
		// this(super(50)) will call the parameterize constructor A(int i) of parent class. 
		//super(10 , 20);
		// this(super(10,20)) will call the parameterize constructor A(int i , int j) of parent class.
		// when we don't pass super keyword then default parameter will be called 
		// when we pass super keyword with one parameter then one parameter constructor will be code
		// when we pass super keyword with two parameter then two parameter constructor will be code
		System.out.println("Child Class");
	}
		public B(int i){
			//only one "super" statement will be in a child class constructor
			super(i);
			System.out.println("Child class");
		}
		public B(int i , int j){
			super(i ,j);
			System.out.println("Child class");
			
		}
	
	public static void main(String[] args) {
	/*when we are creating object of child class and running the main method then constructor of parent class
		will be called first(if we have created default constructor of parent class) 
		and then the constructor of child class will be called*/
		B b = new B();
		B b1 = new B(10);
		B b2 = new B(20,30);
		/*output: 
		Parent class
		Child Class*/
		
		// Constructor can be overloaded.
		
	}

	
}
