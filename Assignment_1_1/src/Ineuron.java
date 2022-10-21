
public class Ineuron {

	public static void main(String[] args) {
		// program to print INEURON - design pattern
		int n=13;
		
		for (int i=0;i<=n;i++) {
			//print I
			for (int j=0;j<=n;j++) {
				if ((i==0) || (i==n) || (j==n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//print N
			for (int j=0;j<=n;j++) {
				if ((j==0) || (j==n) || (i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//print E
			for (int j=0;j<=n;j++) {
				if ((j==0) || (i==0) || (i==n) || (i==n/2 && j<3*n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//print U
			for (int j=0;j<=n;j++) {
				if ((j==0 && i<n) || (j==n && i<n) || (i==n && j>0 && j<n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//print R
			for (int j=0;j<=n;j++) {
				if ((j==0) || (j==n/2 && i>0 && i<n/2) || (i==0 && j<n/2) || (i==n/2 && j<n/2) || (i-j==n/2 && i>=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//print O
			for (int j=0;j<=n;j++) {
				if ((j==0 && i>0 && i<n) || (j==n && i>0 && i<n) || (i==0 && j>0 && j<n) || (i==n && j>0 && j<n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//print N
			for (int j=0;j<=n;j++) {
				if ((j==0) || (j==n) || (i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			System.out.println();
		}
		
	}

}
