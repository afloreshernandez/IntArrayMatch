package com.collabera.exercises;

	import java.util.Scanner;

	public class EvenString {
	    public static void main(String[] args)
	    {
	        System.out.println("Enter a sentence");

	        // get input and convert it to a list
	        Scanner keyboard = new Scanner(System.in);
	        String sentence = keyboard.nextLine();
	        String[] sentenceList = sentence.split(" ");

	        // iterate through the list and write elements with odd indices to a String
	        String returnVal = new String();
	        for (int i = 1; i < sentenceList.length; i+=2) {
	            returnVal += sentenceList[i]+" "; // printing out with space.
	        }

	        // print the string to the console, and remove trailing whitespace.
	        System.out.println(returnVal);
	    }
	}
