/*
Declares two arrays of 5 integers
Fill 1 array with program supplied values
Fill the second array with user (keyboard) supplied values
Display both arrays on the console
Format:
Arrays are to be declared in main
Supply the first array with values when declared
Code a function to fill the second array from the keyboard input
Code a function to display an array passed to it as a parameter
 */

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args)
	{
		int[] arrayOne = { 20, 1, 19, 81, 36 };
		int[] arrayTwo = new int[5];
		
	//Calling the function to fill out the arrayTwo
		fillOutArray(arrayTwo);
	
	//Printing the different arrays
		System.out.println("The content of the array supplied values");
		PrintingArrayOfInetgers(arrayOne);
		
		System.out.println("The content of the second array from the keyboard input");
		PrintingArrayOfInetgers(arrayTwo);	
	}
	
	//Method to fill out the second array
	public static void fillOutArray(int[] arrayToFill)
	
	{
		System.out.println("Please enter the value");
		
		for (int i = 0; i < 5; i++)
		{
			Scanner in = new Scanner(System.in);
			arrayToFill[i] = in.nextInt();
		}
	}
	
	//Method to print the Array of Integers
		public static void PrintingArrayOfInetgers(int[] arrayOfIntegersToPrint) {
			for(int i=0;i<arrayOfIntegersToPrint.length;i++) {
				System.out.println(""+arrayOfIntegersToPrint[i]);
			}
		}
	

}
