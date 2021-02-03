package Assignment1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=0;

		while (num != 0) {
			int number = num % 10;
			temp = temp * 10 + number;
			num = num / 10;
		}
		System.out.println("The Reverse Number : " + temp);
		sc.close();
	}

}
