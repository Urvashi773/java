package com.rays.string;

public class Slide40 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer ("Urvashi");
		sb.append(" Aditi");
		 System.out.println(sb);
		System.out.println("lenth - " + sb.length());
		System.out.println("capacity - " + sb.capacity());
		System.out.println("char at - " + sb.charAt(2));
		System.out.println("index of - " + sb.indexOf("iti"));
		System.out.println("replace - " + sb.replace(0,5,"aa"));
		System.out.println("reverse - " + sb.reverse());
	}
}
