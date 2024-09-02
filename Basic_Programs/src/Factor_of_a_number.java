import java.util.Scanner;
public class Factor_of_a_number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any number:- ");
		int num = Sc.nextInt();
		Sc.close();
		System.out.print("factors of the "+num+" is:- ");
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
