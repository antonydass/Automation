package com.Expressions.Programs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserGetiing {
	
	public static void main(String args[]){
		String a= "anto602";
		String b;
		
		Scanner in = new Scanner(System.in);
		
		 System.out.println("Enter the string");
		 
		 b=in.nextLine();
		
		 Pattern.compile("\\d").matcher(a).matches();
		 
	}
}
