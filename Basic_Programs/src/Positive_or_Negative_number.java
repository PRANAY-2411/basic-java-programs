import java.util.Scanner;
public class Positive_or_Negative_number {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number to find positive or Negative");
		int number = Sc.nextInt();
		Sc.close();
		if(number>=1) {
			System.out.println("Given number is positive");
		}
		else if(number<0) {
			System.out.println("Given number is negative");
		}
		else {
			System.out.println("Given number is 0");
		}
	}

}
