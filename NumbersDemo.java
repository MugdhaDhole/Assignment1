package Assignment1;

public class NumbersDemo {

	public static void main(String[] args) {
		
		System.out.println("The Prime Numbers from 10 to 99 are : ");

		for (int i = 10; i <= 99; i++) {

			boolean isPrime = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.print(i + " ");
		}

	}
}
