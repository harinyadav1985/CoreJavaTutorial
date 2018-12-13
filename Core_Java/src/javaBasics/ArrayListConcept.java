package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("se");
		al.add("34");
		al.add('c');
		//System.out.println(al.size());
		al.add("str12");
		al.add("rtr");
		//System.out.println(al.size());
		al.add("50");
		al.remove(1);
		//System.out.println(al.size());
		//System.out.println(al.get(4));// to get value of an array index we can use .get method
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
			
		}
		ArrayList<Integer> ar = new ArrayList();// to restrict/accept only one type of data we use wrapper class
		ArrayList<String> ar1 = new ArrayList();// to restrict/accept only one type of data we use wrapper class
		
	}}
	

	

