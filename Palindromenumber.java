package week1.day2;

public class Palindromenumber {

	public static void main(String[] args) 
	{
		int input=454;
		int revnum = 0, temp,remainder;
		temp = input;
		while( input != 0)
		{
			remainder = input %10;
			revnum = ( revnum * 10 )+ remainder;
			input = input /10;
			
		}
		if(temp == input)
		{
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
		

	}

}
