import java.util.Scanner;
public class Reverse_of_a_number {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num=Sc.nextInt();
	Sc.close();
		int temp=1;
		int result=0;
		
		for(;num!=0;) {
			temp=num%10;
			result=temp+(result*10);
			num=num/10;
		}
		System.out.println("Reverse of the number is:-"+result);
	}
}
