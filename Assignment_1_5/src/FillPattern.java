
public class FillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		for(int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
//				if((i==n) || (j==0 && i>=n/2) || (j==n && i >= n/2) || (i-j >= n/2) || (i+j >= 3*n/2))
				if((i==0) || (i==n) || (i-j >= n/2) || (i+j <= n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}

}
