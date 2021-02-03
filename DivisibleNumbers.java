package Assignment1;

public class DivisibleNumbers {

	public static void main(String[] args) {
		System.out.println("First 5 numbers divisible by 2, 3 and 5 are ");
		int count = 0;
		for (int i = 0; i >= 0; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				count++;
				if (count == 5) {
					break;
				}
			}
		}
	}
}
