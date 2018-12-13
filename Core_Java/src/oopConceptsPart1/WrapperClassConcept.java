package oopConceptsPart1;

public class WrapperClassConcept {
public static void main(String args[]){
	//String to integer
	String str= "101";
	int b=100;
	int a= Integer.parseInt(str);
	System.out.println(a+b);
	//String to double
	double k=23;
	String ab= "12.23";
	double abc=Double.parseDouble(ab);
	double sum=k+abc;
	System.out.println(sum);
	//String to Character ,we don't have wrapper(parse) class
	//String to Boolean
	String str1="true";
	System.out.println(Boolean.parseBoolean(str1));
	//integer to String
	int i= 10;
	String abcd =String.valueOf(i);
	System.out.println(abcd);
	//String to Integer when String have partial integer then we will get an exception NumberFormatException
	String str3 = "101b";
	int r = Integer.parseInt(str3);
	System.out.println(r);
}
	
}
