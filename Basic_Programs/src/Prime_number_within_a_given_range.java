import java.util.Scanner;
public class Prime_number_within_a_given_range {

	public static void main(String[] args) {		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter first number:-");
		int first = Sc.nextInt();
		
		System.out.print("Enter last number:-");
		int last = Sc.nextInt();
		Sc.close();
		
		System.out.print("prime numbers between "+first+" to "+last+" is :-");
		for(int i=first; i<=last; i++){
			int count=0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count=count+1;
				}
			}
			if(count<=2) {
				System.out.print(i+" ");
			}
		}	
	}
}