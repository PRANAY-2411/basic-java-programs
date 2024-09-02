import java.util.Scanner;
public class Factorial_of_a_number {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num = Sc.nextInt();
		Sc.close();
		int result=1;
		for(int i=num;i>=1;i--) {
			result=result*i;
		}
		System.out.println(num+" factorial is :- "+result);
	}
}
