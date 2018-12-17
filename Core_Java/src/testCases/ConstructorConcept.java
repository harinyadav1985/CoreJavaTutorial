package testCases;

/*Constructor: it is a class entity which is used to define some class feature 
 while creating the object. while creating the object if we want some feature to be in the 
  form of global variable then we need to use constructor.*/ 
// constructor will looks like a function but it is not a function 
// constructor name should be same as class name and it cannot return any value.
// while declaring constructor only "public" and "class name" will be used
//Constructor can be overloaded
//when we created a parameterized constructor then we cannot retrieve the default hidden constructor
public class ConstructorConcept {

	public ConstructorConcept(){
		// default constructor which means we are not passing anything. zero parameter constructor
	System.out.println("default construtor");	
	}
	public ConstructorConcept(int i){// single parameter constructor
		System.out.println(i);
	}
	public ConstructorConcept(int i , int j){// single parameter constructor
		System.out.println(i);
		System.out.println(j);
	}
// how to call a constructor? when we create an object of the class constructor will be automatically called
public static void main(String args[]){
	ConstructorConcept cc = new ConstructorConcept();//ConstructorExample1() this is default constructor
	ConstructorConcept cc1 = new ConstructorConcept(10);
	ConstructorConcept cc2 = new ConstructorConcept(20);
// when we have not created Default constructor then also in class there is a default constructor(hidden) 

//Actions act = new Action(driver); here Action() is not a default constructor bcz we need to pass driver
}
}
