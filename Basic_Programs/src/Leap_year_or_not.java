import java.util.Scanner;
public class Leap_year_or_not {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your year:");
		int year = Sc.nextInt();
		Sc.close();
		if(year%4==0) {
			if(year%400==0) {
				System.out.println("Give year is leap century");
			}
			else {
				System.out.println("Give year is leap year");
			}
		}
		else {
			System.out.println("Give year is not leap year");
		}
	}

}
