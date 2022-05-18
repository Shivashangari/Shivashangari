public class ArmStrongNumber {
	int number1 = 0, number2 = 500;

	public void operation() {
		for (int iterate = number1; iterate < number2; iterate++) {
			int check, remainder, armstrongNumber = 0;
			check = iterate;

			while (check != 0) {
				remainder = check % 10;
				armstrongNumber = armstrongNumber + (remainder * remainder * remainder);
				check = check / 10;
			}
			if (armstrongNumber == iterate) {
				System.out.println(iterate + " is an Armstrong number");
			}
		}
	}
}
