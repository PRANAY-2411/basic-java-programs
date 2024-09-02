import java.util.Scanner;
public class Greatest_of_the_Three_numbers {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a value:-");
		int a = Sc.nextInt();
		
		System.out.println("Enter b value:-");
		int b = Sc.nextInt();
		
		System.out.println("Enter c vlaue:-");
		int c = Sc.nextInt();
		Sc.close();
		if(a>b)
		{
			if(a>c) {
				System.out.println("Greatest value is A");
			}
			else {
				System.out.println("Greatest value is c");
			}
		}
		else {
			if(b>c) {
				System.out.println("Greatest value is B");
			}
			else {
				System.out.println("Greatest value is c");
			}
		}
	}
}
