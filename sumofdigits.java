package leetcode.arrays;

public class sumofdigits {
	public static int compute(int n)
	{
	if (n < 9)
		return n;
	else if (n % 9 == 0)
		return 9;
	else 
		return  n % 9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 55;
		System.out.println(sumofdigits.compute(num));
		

	}

}
