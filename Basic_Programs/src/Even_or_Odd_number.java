import java.util.Scanner;
public class Even_or_Odd_number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number :-");
		int num = Sc.nextInt();
		Sc.close();
		if(num%2==0) {
			System.out.println("Given number is Even number");
		}
		else {
			System.out.println("Given number is odd number");
		}
	}

}
