import java.util.Scanner;
public class Addition_of_two_matrix {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows in first matrix:-");
		int m=Sc.nextInt();
		
		System.out.print("Enter the number of colums in first matrix:-");
		int n=Sc.nextInt();
		
		System.out.print("Enter the number of rows in secound matrix:-");
		int p=Sc.nextInt();

		System.out.print("Enter the number of colums in secound matrix:-");
		int q=Sc.nextInt();
		
		if(m==p&&n==q) { 
			           
			
			int a[][]=new int[m][n];
			int b[][]=new int[p][q];
			int c[][]=new int[m][n];
			
			System.out.println("Enter elements in first matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=Sc.nextInt();
				}
			}
			System.out.println("Enter elements in secound matrix");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					b[i][j]=Sc.nextInt();
				}
			}
			Sc.close();
			System.out.println("first matrix is:-");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("secound matrix is:-");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("Additon of two matrixs is:-");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					c[i][j]=a[i][j]+b[i][j];
					if(c[i][j]<10) {
						System.out.print("0"+c[i][j]+" ");
					}
					else {
						System.out.print(c[i][j]+" ");
					}
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("\ntwo matrixs sizes are not same......");
		}	
	}
}
