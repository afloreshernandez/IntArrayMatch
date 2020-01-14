package com.collabera.exercises;

import java.util.Arrays;
class SortArrayExample {
 
  public static void main(String[] args) {
    // int Array
    int[] intArr = 
        new int[] { 14, 16, 3, 15, 8, 5, 9, 11, 30 };

    // Sorting int Array
    Arrays.sort(intArr);
 
    // Displaying elements of int Array
    System.out.println("Int Array Elements:");
    for (int i = 0; i < intArr.length; i++)
    System.out.println(intArr[i]);
 
    // String Array
    String[] stringArr = 
        new String[] { "Arianne", "Oscar","Jordan", "Carter" };

    // Sorting String Array
    Arrays.sort(stringArr);

    // Displaying elements of String Array
    System.out.println("String Array:");
    for (int i = 0; i < stringArr.length; i++)
        System.out.println(stringArr[i]);
  }
}