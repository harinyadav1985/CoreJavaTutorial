package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String args[]){
		 LinkedList<String> ll = new LinkedList<String>();
		 //add()
		 ll.add("qtp");
		 ll.add("selenium");
		 ll.add("RPA");
		 ll.add("RFT");
		 //print
		 System.out.println(ll);
		 //AddFirst
		 ll.addFirst("hari");
		 //AddLast
		 ll.addLast("End");
		 System.out.println(ll);
		 //get
		 System.out.println(ll.get(0));
		 //set
		 ll.set(0, "ramesh");
		 System.out.println(ll.get(0));
		 //Remove first and last element
		 ll.removeLast();
		 ll.removeFirst();
		 System.out.println(ll);
		 ll.remove(3);
		 System.out.println(ll);
		 /*how to print all the values of linkedList:-
		 1. for loop
		 2. Advance for loop
		 3. Iterator
		 4. While loop */
		 for(int z=0;z<ll.size();z++){
			 System.out.println(ll.get(z));
		 }
		 for(String y : ll){
			 System.out.println(y);
		 }
		 Iterator<String> it = ll.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 int num=0;
		 while(ll.size()>num){
			 System.out.println(ll.get(num));
			 num++;
		 }
	}}
