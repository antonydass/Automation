package com.Expressions.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {

	public static void main(String args[]){
		
		//1st way
		
		Pattern p = Pattern.compile("...s");
		Matcher m = p.matcher("dsss");
		
		boolean b = m.matches();
		System.out.println(b);
		
		
		// 2way
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		
		boolean b3= Pattern.matches(".a", "as");
	}
}
