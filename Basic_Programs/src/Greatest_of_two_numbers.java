import java.util.Scanner;
public class Greatest_of_two_numbers {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = Sc.nextInt();
		System.out.println("Enter secound number");
		int secound =Sc.nextInt();
		Sc.close();
		if(first>secound) {
			System.out.println("First number is Greatest");
		}
		else if(first<secound) {
			System.out.println("Secound number is Greatest");
		}
		else {
			System.out.println("Two numbers are equal");
		}
	}
}
