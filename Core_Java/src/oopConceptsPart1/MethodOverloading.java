package oopConceptsPart1;

public class MethodOverloading {

	public static void main(String args[]){
		MethodOverloading obj = new MethodOverloading();
		obj.sum(2, 3);
		obj.sum();
		obj.sum(2);
		
	}
/*We cannot create 2 methods with same name and same parameter/arguments,
we need to take the different parameter/parameter whit in the same class and this is called method overloading*/
	//We cannot create a method whit in another method
	public void sum(){
		System.out.println("Sum method with no param");
			}
	public void sum(int i){//one parameter
		System.out.println("Sum method with no param");
			}
	public void sum(int i , int x){//two parameter
		System.out.println("Sum method with no param");
			}
}
