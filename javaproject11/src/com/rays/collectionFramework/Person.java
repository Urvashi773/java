package com.rays.collectionFramework;

import java.util.Collection;

public class  Person {
	 private int id;
	 private String name;
	 private String address;
	 
	 public Person(int id , String name , String address) {
		 this.id = id;
		 this.name = name;
		 this.address = address;
	 }
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return id +" "+ name+ " " + address ;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)){
			System.out.println("in instance");
			return false;
		}
		Person p = (Person)obj;
		boolean b= this.id == p.id && this.name == p.name && this.address == p.address;
		return b;
	}
	@Override
	public int hashCode() {
		String str = id + name + address;
		return str.hashCode();
	}
	
}
