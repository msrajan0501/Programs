package aprtop20arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 17, 14, 35, 59, 1 ,2};

		if (arr.length < 2)
		{
			System.out.println("insufficient input");
		}
		else 
		{
			int smallest = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i] < smallest)
				{
					secondSmallest = smallest;
					smallest = arr[i];
				} 
				else if (arr[i] < secondSmallest)
				{
					secondSmallest = arr[i];
				}

			}
System.out.println(smallest);
System.out.println(secondSmallest);
		}

	}

}
