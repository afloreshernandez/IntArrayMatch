package com.collabera.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintS {
	
	public static void main(String[] args) {
	    String text = "my very long string to test";
	    Matcher m = Pattern.compile("(^|\\W)(\\w*)").matcher(text);
	    while (m.find()) {
	      System.out.println("Found: "+m.group(2));
	    }
	 }

}
