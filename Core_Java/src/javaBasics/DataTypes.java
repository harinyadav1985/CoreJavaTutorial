package javaBasics;

public class DataTypes {
	
	public void number(){
		int num1 = 20;
		System.out.println(num1);
	}

	public static void main(String[] args) {
	int i=10;//primitive data type
	//int i=20;duplicate local variable not allowed
	i=20;
	double d =12.23;//primitive data type
	double d1=12.77;//primitive data type
	System.out.println(d+d1);
	char charExample = 'C';//primitive data type
	System.out.println(charExample);
	
	char charExample1='1'; // Charecter should be single digit value and should be in single qoute
	System.out.println(charExample1);
	System.out.println(charExample +"  "+charExample1);
	boolean b= true;//primitive data type
	boolean b1= false; // true and false value only
	String str="here i am"; // it is a class and should be written in double quote	
	String str1="where you are";//non-primitive data type
	System.out.println(str+str1);
	//derived data type is also non-primitive data type
	int abc[] = new int [4];//non-primitive data type
	
	DataTypes dt = new DataTypes();// non-primitive data type
	
	
	}

}
