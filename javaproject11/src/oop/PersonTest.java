package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {
public static void main(String[] args) throws ParseException {
	Person p = new Person();
	String s = ("11/05/2001");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	
	p.setName("Urvashi Upadhyay");
	System.out.println("Name is - " + p.getName());
	p.setAddress("Indore");
	System.out.println("Address is - " + p.getAddress());
	System.out.println("Age is - " + p.getAge());
	p.setDob(d);
	System.out.println("Date is - " + sdf.format(p.getDob()));
	
	
}
}
