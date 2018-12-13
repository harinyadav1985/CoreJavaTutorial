package javaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
	Hashtable ht = new Hashtable();// store as key and value
	ht.put("UserName", "hari");
	ht.put("password", "pass");
	ht.put("ID", "12");
	System.out.println(ht.size());
	ht.put("state", "delhi");
	System.out.println(ht.size());
	ht.put(1, 12);
	ht.put(2, 24);
	System.out.println(ht.size());
	System.out.println(ht.get("UserName"));
	Hashtable<Integer,String> ht1 = new Hashtable();// we can restrict dataType for Key and value both
	ht1.put(4, "Value");
	System.out.println(ht1.get(4));
	
	
	}

}
