import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		int max = 100, min = 0, mid = min + max / 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100");
		while (true) {
			System.out.println("Press 1 if your number is greater than or equal to: " + mid);
			System.out.println("Press 2 if your number is less than : " + mid);
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("Is your number is : " + mid + " Press 1");
				int num = sc.nextInt();
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
		System.out.println("your number is :" + mid);

	}
}
