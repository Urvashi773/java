package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPerson {
	public static void main(String[] args) {
		
	Person p1 = new Person(3,"urvashi","indore");
	Person p2 = new Person(1,"aditi","indore");
	Person p3 = new Person(4,"abs","indore");
	Person p4 = new Person(2,"abs","indore");
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3.equals(p4));
	System.out.println(p3.hashCode());
	System.out.println(p4.hashCode());
	List list = new  ArrayList();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
	
	

}
}
