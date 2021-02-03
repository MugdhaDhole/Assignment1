package Assignment1;
import java.util.Scanner;
public class NumberSeriesDemo {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		for(int i=1;i<=n;i++)
		{
			temp=i*i*i;
			System.out.println(temp);
		}
		sc.close();
	}
}
