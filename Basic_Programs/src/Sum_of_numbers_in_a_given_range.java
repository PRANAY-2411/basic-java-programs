import java.util.Scanner;
public class Sum_of_numbers_in_a_given_range 
{

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter first number:- ");
		int num1 = Sc.nextInt();
		System.out.print("Enter secound number:- ");
		int num2 = Sc.nextInt();
		Sc.close();
		int result=0;
		for(int i=num1; i<=num2; i++) 
		{
			result=i+result;
		}
		System.out.println("Sum of number from "+num1+" to "+num2+" is :- " + result);
	}
}
