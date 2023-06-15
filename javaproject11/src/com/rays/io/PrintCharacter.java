package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PrintCharacter {
	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("C:\\Users\\Anurag\\Desktop\\io java core\\abc.txt");
		int ch = in.read();
		while(ch!=1) {
			System.out.println((char)ch);
			ch = in.read();
		}
		
		

	}
	
}
