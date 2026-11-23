/**
 * Program
 */
public class Program {

	public static void main(String[] args) {

		int number = 479598;
		int counter = 6;
		int result = 0;

		while(counter != 0) {
			result += number % 10;
			System.out.println(result);
			number += number / 10;
			System.out.println(number);
			counter--;
		}
		System.out.println(result);
	}
}