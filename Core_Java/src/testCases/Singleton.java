package testCases;

public class Singleton {


		// A singleton class is a class which can have only one object(instance) of the class at a time.
		// How to design a singleton class
		//1. make sure the constructor as private
		//2. write a public static method(getInstance) that has return type of object of this singleton class (lazy initialization)
		
/*Difference between normal class and singleton class?
 * We use constructor for Normal class whereas we use getInstance method for the instantiate in singleton class
	
	*/
	private static Singleton Singleton_instance = null;
		public String str;
		private Singleton(){
			str = "hey, I am using Singleton class";
		}
		public static Singleton getInstance(){
			//lazy initialization
			if(Singleton_instance == null)
				Singleton_instance = new Singleton();
			return Singleton_instance;

		}
		public static void main(String args[]){
			Singleton x = Singleton.getInstance();
			Singleton y = Singleton.getInstance();
			Singleton z = Singleton.getInstance();
		x.str =(x.str).toUpperCase();
//converting4 one but the value is changing for all 3 bcz all of them are referring single object/instance
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str =(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		}	
	}


