package com.Expressions.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
	public static void main(String args[]){

		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher("This is antony 602 my -5number is 123");
		
		while (m.find()){
			System.out.println(m.group());
			
		}
		
	}
}
