package Assignment1;

public class PatternProgram {

	public static void main(String[] args) {

		// Using For loop
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Using While loop

		int row = 1;
		int column = 1;
		int a;
		do {
			a = 2;
			do {
				System.out.print("");
				a--;
			} while (a >= row);
			column = 1;
			do {
				System.out.print("*");
				column++;
			} while (column <= row);
			System.out.println(" ");
			row++;
		} while (row <= 3);

	}
}
