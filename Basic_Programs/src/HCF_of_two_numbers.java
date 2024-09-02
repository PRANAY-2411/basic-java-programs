import java.util.Scanner;
public class HCF_of_two_numbers {
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter first number:-");
		int a=Sc.nextInt();
		System.out.println("Enter secound number:-");
		int b=Sc.nextInt();
		Sc.close();
		int hcf=0;
		
		for(int i=1;i<=a || i<=b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		System.out.println("heigest common factor of two number is: "+hcf);
		
	}
}
