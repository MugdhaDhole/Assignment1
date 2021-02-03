package Assignment1;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
			count = 0;
		}
		sc.close();
	}
}
