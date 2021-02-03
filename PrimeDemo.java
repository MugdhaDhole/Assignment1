package Assignment1;

import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					temp = 1;
					break;
				} else {
					temp = 0;
				}
			}
			if (temp == 1)
				System.out.print(num + " is not a Prime Number");
			else
				System.out.print(num + " is Prime Number");
		}
		sc.close();
	}

}
