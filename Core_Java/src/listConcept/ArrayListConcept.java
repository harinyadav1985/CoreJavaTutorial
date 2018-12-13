package listConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept { 

	public static <E> void main(String[] args) {
		
		int i[] = new int[3];// it is static array
		
		//non generic and generic (before in java jdk1.5 it was not available)
		// non generic the data type of values stored into ArrayList is not defined
		ArrayList al = new ArrayList(); // ArrayList is raw type warning will be displayed
		
				// generic means to define the data type of values stored into ArrayList
	ArrayList<Integer> al1 = new ArrayList<Integer>();//we have to use Wrapper class (Integer , String , Boolean , Floot,.)
		
		// ArrayList is dynamic array
		//Can contains Duplicate value/elements
		//maintain insertion order
		//it is not synchronized/ it is not thread safe
		//allow random access to fetch the element because it stores the values on the basis of indexes.
		ArrayList<E> al2 = new ArrayList<E>();// if we are not sure what type of data we are going to store then use this.
		
		// different class object can also be stored ArrayList 
		al.add(12);
		al.add(12);		
		al.add(12);
		System.out.println(al.size());
		al.add(12);
		System.out.println(al.size());// size of array
		System.out.println(al.get(2));// to get the value of array
/*to print all the values of ArrayList we can use
		"for loop" or "Iterator" as it stores the data in indexing manner
*/
		for(int j=0; j<al.size();j++){
			System.out.println(al.get(j));
		}
		
		// Employee class objects
		Employee e1= new Employee("hari",32,"IT");
		Employee e2= new Employee("raj",40,"transport");
		Employee e3= new Employee("rajesh",40,"finance");
	//Create ArrayList
		ArrayList<Employee> al4 = new ArrayList<Employee>();
		al4.add(e1);
		al4.add(e2);
		al4.add(e3);
		// Iterator to traverse the value
		Iterator<Employee> it = al4.iterator();
		// we cannot use "for loop" because iterator does not work on the basis of indexes
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//addAll() ---to add 2 ArrayList 
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("test");
		al5.add("Selenium");
		al5.add("java");
		ArrayList<String> al6 = new ArrayList<String>();
		al6.add("dev");
		al6.add("java");
		al6.add("javascript");
		al5.addAll(al6);
		System.out.println(" The addition of 2 arraylist : ");
	for(int j=0;j<al5.size();j++){
		System.out.println(al5.get(j));
	}
		al5.remove(5);
		System.out.println(" values after remove ");
		for(int j=0;j<al5.size();j++){
			System.out.println(al5.get(j));
	}
		// retainAll() -- is used to display only the common values
	al5.retainAll(al6);
	for(int j=0;j<al5.size();j++){
		System.out.println(al5.get(j));
	}
	}}
