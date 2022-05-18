package Task_22String;

public class PalindromeString {

	public static void main(String[] args) {
		int number = 1221;
		int orgnumber = number;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		if (orgnumber == reverse) 
		{
			System.out.println(orgnumber + " " + " is a palindrome number");

		}
		else 
		{
			System.out.println(orgnumber + " " + "not a palindrome");
		}

	}

}
