import java.util.Scanner;
public class Fibonacci_Series_upto_nth_term {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num = Sc.nextInt();
		Sc.close();
		int a=0 , b=1;
		System.out.print("Fibonacci Series upto "+num+" is:- "+a+" "+b);
		int sum=0;
		for(;sum<num;) {
			sum=a+b;
			a=b;
			b=sum;
			if(sum<num)
				System.out.print(" "+sum);
		}
	}
}
