package Assignment1;

import java.util.Scanner;

public class NumberValueSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of lines : ");
		int num = sc.nextInt();
		int sum = 0;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of values in the given number is : "+sum);
		sc.close();
	}
}
