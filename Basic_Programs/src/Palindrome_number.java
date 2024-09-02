import java.util.Scanner;
public class Palindrome_number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter any number:-");
		int num = Sc.nextInt();
		
		Sc.close();
		int a=num;
		int temp=1;
		int result=0;
		
		for(;num!=0;) {
			temp=num%10;
			result=temp+(result*10);
			num=num/10;
		}
		if(a==result) {
			System.out.println(a+" = "+result+" this is polindrome number");
		}
		else {
			System.out.println(a+" != "+result+" is not polindrome number");
		}
	}
}
