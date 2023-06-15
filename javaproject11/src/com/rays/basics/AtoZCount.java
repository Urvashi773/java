package com.rays.basics;

public class AtoZCount {
	public static void main(String[] args) {
		String name = "urvashi upadhyay";
		int count = 0;
		for(char i = 'a'; i<='z';i++) {
			for(int c = 0; c< name.length(); c++) 
			{
				if(name.charAt(c) == i) 
				{
					count++;
				}
				
			}
			if(count>0) {
				System.out.println(i + "=" + count);
				count = 0;
			}
			
		}
		
		
	}

}
