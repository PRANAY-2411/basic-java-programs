import java.util.Scanner;
public class Finding_Prime_Factors_of_a_number {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		Sc.close();
		System.out.println("Enter any number:-");
		int n = Sc.nextInt();
		
		System.out.print("Prime Factors : ");
	    for (int i = 2; n > 1; i++) {

	      if (n % i == 0) {

	        while (n % i == 0) {

	          System.out.print(i + " ");
	          n = n / i;
	        }
	      }

	    }
	}
}
