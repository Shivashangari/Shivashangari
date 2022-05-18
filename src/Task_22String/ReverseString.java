package Task_22String;

import java.util.Scanner;

public class ReverseString {
	// Driver Code
	public static void main(String[] args) {
		// Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");

		String stringinput = scan.nextLine(); // Input the string
		// Call a recursive function to reverse the string

		String reverse = reverseString(stringinput);
		System.out.println("The reverse of the entered the String :" + reverse);
		scan.close();

	}

	// Recursive Function to Reverse the String
	public static String reverseString(String stringinput) {
		// If entered string is empty
		// Return the empty string

		if (stringinput.isEmpty()) {
			return stringinput;
		}
		// If string consists of multiple character
		// Call the Function Recursively
		else {//hello h ello e
			return reverseString(stringinput.substring(1)) + stringinput.charAt(0);
		}
	}
}
