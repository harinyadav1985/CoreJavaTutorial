package oopConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created , obj is the reference variable, refereeing to this object
		//after creating the object, the copy of all the non-static method is given to this object
	obj.test();
	int add = obj.add();	
	System.out.println(add);
	String s= obj.qa();
	System.out.println(s);
	int mulitply = obj.multiplication(2, 10);
	System.out.println(mulitply);
	
	// main method is void because it never return any value
	
	}
	//non static methods
	//void --- does not return any value
	//return type = void
	public void test(){  // no input , no output
		System.out.println("Hey! there");
	}
	public int add(){//no input , some output
		int a=10,b =30 ,c =a+b;
		return c;
	}
	public String qa(){ // no input , some output
		String S = "goa";
		return S;
	}
	public int multiplication(int x , int y){// some input , some output
		int mul =x*y;
		System.out.println("muliply method");
		return mul;
	}
}
