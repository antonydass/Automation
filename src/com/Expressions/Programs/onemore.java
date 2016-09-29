package com.Expressions.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class onemore {

	
	public static void main(String args[]){
		String input = "dog cat dog aaaa dg";
		
		Pattern pattern = Pattern.compile("(dog\\b)");
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
		    System.out.println("Found this wiki word: " + matcher.group());
		}
	}
}
