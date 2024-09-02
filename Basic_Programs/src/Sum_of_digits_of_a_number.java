import java.util.Scanner;
public class Sum_of_digits_of_a_number {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter any number:-");
		int num = Sc.nextInt();
		Sc.close();
		
		int a = num;
		int temp=1;
		int result=0;
		for(;num!=0;) {
			temp=num%10;
			result=temp+result;
			num=num/10;
		}
		System.out.println("Sum of digits of "+ a +" is :"+result);
	}
}
