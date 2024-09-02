import java.util.Scanner;
public class Program_to_find_Nth_Fibonacci_Number {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num=Sc.nextInt();
		Sc.close();
		int a=0, b=1;
		int result;
		for(int i=1;i<=num;i++) {
			result=a+b;
			a=b;
			b=result;
		}
		System.out.println(num+"th term of fibonacci sequence is:- "+b);
	}
}
