package com.collabera.exercises;


//Each new term in the Fibonacci sequence is generated 
//by adding the previous two terms. By starting with 1 and 2, 
//the first 10 terms will be:",
//    "1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...\n",
//    "By considering the terms in the Fibonacci sequence "
//    "whose values do not exceed four million, find the sum of the even-valued terms,"
//    + "using while loop"



public class Fibonacci {
	   public static void main(String[] args) {    
	    int num1 = 1;
	    int num2 = 2;
	    int temp = 0;
	    int sum = 0;

	    do {
	        if (num2 % 2 == 0) {
	            sum = sum + num2;
	        }
	        temp = num1 + num2;
	        num1 = num2;
	        num2 = temp;
	    } while (num2 < 4000000);

	    System.out.println(sum);
	  }
	}