package oopConceptsPart1;

public class Car {
	
	//Class Variables
	int model;
	int wheel;
	public static void main(String[] args) {
		Car a = new Car();
		// new Car() is object , a is object reference and Car is class
		Car b = new Car();
		Car c = new Car();
		a.model =2014;
		a.wheel=3;
		
		b.model =2010;
		b.wheel =4;
		
		c.model = 2018;
		c.wheel=10;
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		//Shifting of object reference from one object to another object
		a=b;// now a refer the address of b
		b=c;// now b refer the address of c
		c=a;// now c refer the address of b as in 1st line the reference is change to b
	a.model=2019;
	System.out.println(a.model);
	c.model =2020;
	System.out.println(a.model);
	System.out.println(c.model);
	
	}

}
