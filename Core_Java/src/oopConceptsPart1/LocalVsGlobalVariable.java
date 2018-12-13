package oopConceptsPart1;

public class LocalVsGlobalVariable {

	int Age =10; // defined just after class then it is global(class) variable
	String Nage = "kahan gaye the";
	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.sum());
		System.out.println(obj.Age);
		
	}
public int sum(){
	int i =25 , j=35, Sum=i+j;
	return Sum;
}
}
