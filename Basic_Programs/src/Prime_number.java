import java.util.Scanner;
public class Prime_number {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num = Sc.nextInt();
		Sc.close();
		int count=0;
		if(num>=1)
		{
		
					for(int i=1; i<=num; i++) 
					{
						if(num%i==0) {
							count=count+1;
							//System.out.println(i);
						}
					}
						if(count<=2) {
							System.out.println("Given number is prime");
						}
						else {
							System.out.println("Given number is not prime");
						}
			}
			else{
				System.out.println("Please give correct number");
			}
	}
	
}
