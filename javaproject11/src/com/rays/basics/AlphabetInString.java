package com.rays.basics;

public class AlphabetInString 
{
public static void main(String[] args)
{
	String s = "aditiee" ;
	int count = 0;
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i) == 'e') 
		{
			count++;
		}
	}
    System.out.println("count of i = " + count);
}
}
