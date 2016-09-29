package com.Expressions.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Allexpressions {
	
	public void Number(){
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher("This is validate the number displaye -5,602,8");
	    while (m.find())
	    System.out.println(m.group());
	    	
	    }
		
	public void Word(){
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher("9176450707 &@#4 this is antony");
		while(m.find()){
		System.out.println("*****" + m.group());		
		}
		}		
			
			
		public void Nonword(){
			
		Pattern p = Pattern.compile("\\W+");
		Matcher m = p.matcher("oiu@87^&*");
		
		while(m.find()){
			System.out.println(m.group());
		}
		}
			
		public void With_space(){
		Pattern p = Pattern.compile("\\S+");
		Matcher m = p.matcher(" google anto dass ");
			
		while(m.find()){
		System.out.println(m.group());
				
			}
		}
		public void Non_whitespace(){
		Pattern p = Pattern.compile("\\s+");
		Matcher m = p.matcher(" google go gole ");
				
		while(m.find()){
		System.out.println(m.group());
					
				}
		}		
		public void match_word(){
			Pattern p = Pattern.compile("\\b");
			Matcher m = p.matcher("antony is antony");
			
			while(m.find());
			System.out.println(m.group());
		}
		
	
			
		
			
	

		public static void main(String args[]){
			Allexpressions al = new Allexpressions();
			al.Number();
			
			al.Word();
			al.Nonword();
			al.With_space();
			al.Non_whitespace();
			al.match_word();
}
		}
