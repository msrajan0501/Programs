package basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2022;

		int count = 0;
		while (n > 0) {

			System.out.print(n % 10);// to print the digits in reverse order
			n = n / 10;
			count++;

		}
		System.out.println();
		System.out.println("Tot digits " + count);

	}

}
