import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		int max = 100, min = 0, mid = min + max / 2;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100");
		while (true) {
			System.out.println("Press 1 : If your number is greater than or equal to " + mid);
			System.out.println("Press 2 : If your number is less than " + mid);
			int input = userInput.nextInt();
			if (input == 1) {
				System.out.println("If your number is : " + mid + " Press 1 else Press 0 to continue.");
				int num = userInput.nextInt();
				if (num == 1) {
					break;
				} else {
					min = mid;
					mid = (min + max) / 2;
				}
			} else if (input == 2) {
				max = mid;
				min = mid / 2;
				mid = (min + max) / 2;

			}
		}
		System.out.println("your number is : " + mid);

	}
}
