package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
	int i=10;
	//int i=20;duplicate local variable not allowed
	i=20;
	double d =12.23;
	double d1=12.77;
	System.out.println(d+d1);
	char charExample = 'C';
	System.out.println(charExample);
	
	char charExample1='1'; // Charecter should be single digit value and should be in single qoute
	System.out.println(charExample1);
	System.out.println(charExample +"  "+charExample1);
	boolean b= true;
	boolean b1= false; // true and false value only
	String str="here i am"; // it is a class and should be written in double quote	
	String str1="where you are";
	System.out.println(str+str1);
	}

}
