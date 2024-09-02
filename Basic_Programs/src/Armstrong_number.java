import java.util.Scanner;
public class Armstrong_number{
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = Sc.nextInt();
		Sc.close();

		int num1=num;
		int a=num;
		int result;
		int count=1;
		int temp;
		int sum=0;

		
		for(;num!=0;) {
			result=num/10;
			num=result;

			if(result>0) {
				count++;
			}
		}
		
		for(;num1!=0;) {
			temp=num1%10;
			sum+=(int) Math.pow(temp, count);
			num1=num1/10;
		}
		System.out.println(sum);
		
		if(a==sum) {
			System.out.println("Given number is Armstrong number");
		}
		else {
			System.out.println("Given number is not Armstrong number");
		}
	}
}