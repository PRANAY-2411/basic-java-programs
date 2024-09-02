import java.util.Scanner;
public class Armstrong_number_in_a_given_range{
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number first number :-");
		int first = Sc.nextInt();
		System.out.println("Enter any number Secound number :-");
		int secound = Sc.nextInt();
		Sc.close();
		System.out.println("Armstrong numbers are:-");
	
		for(int x=first; x<=secound; x++) {
			
				int num=x;
				int num1=num;
				int a=num;
				int result=0;
				int count=1;
				int temp=0;
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
				
				if(a==sum) {
					System.out.print(x+"  ");
					
				}
				
				
		  }
	}
}
