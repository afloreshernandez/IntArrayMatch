package com.collabera.exercises;

public class Fibonacci2 {
	
	 // Fibonnaci Sum to 4 Million
	
	public static void main(String[] args) {
	long num1 = 0;
	long num2 = 1;
	long total = 0;
	while(num1 < 4000000 || num2 < 4000000){
		long fibonnaci = num1 + num2;
		
		if (fibonnaci % 2 == 0) total += fibonnaci;
		
		num1 = num2;
		num2 = fibonnaci;
	}
	System.out.println(total);


}
}