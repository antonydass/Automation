package com.Expressions.Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate {

	public void word(){

		
		String a = " ";
		String b;
		
		Scanner in = new Scanner(System.in);
	System.out.println("Enter the new string");		
	a=in.nextLine();
		
		Pattern p = Pattern.compile("(antony\\b)");
		Matcher m = p.matcher(a);
		
		while(m.find()){
			System.out.println("Entered word :" + m.group());
		}
		
	}		
		public void withspace(){
			 String a = "";

			 
			 System.out.println("Enter the string");
			 Scanner in = new Scanner(System.in);
			 
			 a =in.nextLine();
			
			 Pattern p = Pattern.compile(("\\s*dog$"));
			 Matcher m = p.matcher(a);
			 
			 while(m.find()){
				 System.out.println("Spaced Text: "+m.group());
		}
	}	
		public void workword(){
			String a = " ";
			System.out.println("Enter the string");
			
		Scanner in = new Scanner(System.in);
		 a = in.nextLine();
		 
		 Pattern p = Pattern.compile(("\\w*fun"));
		 Matcher m = p.matcher(a);
			
		 while(m.find()){
			 System.out.println("The word is:" + m.group());
		 }
		}
		
		public static void main(String args[]){
			validate val = new validate();
			//val.word();
			//val.withspace();
			val.workword();
			
			
	}	
		
			
			
			
			
		}

	

