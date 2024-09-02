import java.util.Scanner;
public class Power_of_a_number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Sc.close();
		System.out.println("Enter any number :-");
		int num = Sc.nextInt();
		System.out.println("Enter power of number :-");
		int power = Sc.nextInt();
		
		int result=(int)Math.pow(num, power);
		System.out.println(result);
	}

}
