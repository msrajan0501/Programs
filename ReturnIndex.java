package aprtop20arrays;

public class ReturnIndex {

	public static void main(String[] args) {
		// Given a sorted array, return the index of a given value, or -1 if the element
		// cannot be found.
		int[] input = { 1, 2, 5, 7, 9, 13, 28 };

		int number = 28;
		boolean found = false;
		for (int i = 0; i < input.length; i++)

		{
			if (input[i] == number) {
				found = true;
				System.out.println(i);
			}

		}
		if (found == false)
			System.out.println("Not Found");

	}

}
