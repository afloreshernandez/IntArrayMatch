package com.collabera.exercises;

public class SplitFunction {
	
	public static void main(String[] args) {
		
		
		String arianne = "arianne@hernandez";
		
		String[] word = arianne.split("@");
		
		for(String print: word) {
			System.out.println(print);
		}
			
	}

}
