package com.rays.string;

public class Slide39 {
public static void main(String[] args) {
	String name = "Vijay Dinanath Chauhan";
	System.out.println("string length - "+name.length());
	System.out.println("8th character of string- " + name.charAt(7));
	System.out.println("dina index is - "+ name.indexOf("dina"));
	System.out.println(" first i index -" + name.indexOf("i"));
	System.out.println("last index of i - " + name.lastIndexOf("i"));
	System.out.println("V is replaced by T - " + name.replace("V","T"));
	System.out.println("badaa Tijay - "+ name.toUpperCase());
	System.out.println("Chotta Tijay - "+ name.toLowerCase());
	System.out.println("starts with tijay - " + name.startsWith("Tijay"));
	System.out.println("ends with tijay - " + name.endsWith("Tijay"));
	System.out.println("substring - "+ name.substring(7));
}
}
