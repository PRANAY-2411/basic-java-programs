import java.util.Scanner;
public class Sum_of_N_Natural_numbers 
{

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter any number:- ");
		int num = Sc.nextInt();
		Sc.close();
		int result=0;
		for(int i=1; i<=num; i++) 
		{
			result=i+result;
		}
		System.out.println("Sum of the first natural number is :- " + result);
	}
}
