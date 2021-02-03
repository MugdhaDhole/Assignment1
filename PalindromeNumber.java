package Assignment1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp = 0, rem = 0, number = 0;

		temp = num;
		while (num > 0) {
			rem = num % 10;
			number = (number * 10) + rem;
			num = num / 10;
		}
		if (temp == number)
			System.out.println(temp + " is Palindrome number ");
		else
			System.out.println(temp + " is not Palindrome number");
		sc.close();

	}

}
