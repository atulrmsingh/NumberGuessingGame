import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		int secretNum;

		int guess;

		boolean correct = false;

		Scanner sc = new Scanner(System.in);

		System.out.print("GIVE ME SECRET NUMBER: ");
		secretNum = sc.nextInt();

		while (!correct) {

			System.out.print("GUESS: ");
			guess = sc.nextInt();

			if (guess == secretNum) {
				correct = true;
				System.out.println("You are right!");
			}

			else if (guess < secretNum) {
				System.out.println("HIGHER");
			}

			else if (guess > secretNum) {
				System.out.println("LOWER");
			}

		}
	}
}
