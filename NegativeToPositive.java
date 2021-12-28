package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) 
	{
		int input = 45;
		if (input < 0)
		{
			System.out.println("Negative num");
			int res = input * -1;
			System.out.println("The converted positive number is " +res);
		}
		else
		{
			System.out.println("The given number is positive ");
		}



	}

}
