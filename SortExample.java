package com.collabera.exercises;

//A sample Java program to sort an array of integers 
//using Arrays.sort(). It by default sorts in 
//ascending order 
import java.util.Arrays; 

public class SortExample 
{ 
	public static void main(String[] args) 
	{ 
		// Our arr contains 8 elements 
		int[] arr = {13, 7, 6, 7, 2, 2, 101, 101}; 

		Arrays.sort(arr); 

		System.out.printf("Modified arr[] : %s", 
						Arrays.toString(arr)); 
	} 
} 
