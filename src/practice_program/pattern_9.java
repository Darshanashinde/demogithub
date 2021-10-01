package practice_program;

import java.util.Scanner;

public class pattern_9 {

	 
		// TODO Auto-generated method stub
		void pattern(int n) {
			for (int i = 1; i <= n; i++) {
				if (i < n) {
					for (int j = 1; j <= n - i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= i; k++) {
						if (k == i || k == 1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				}
				else
				{
					for(int j=1;j<=2*n-1;j++ )
						System.out.print("*");
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			pattern_9 p9 = new pattern_9();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no of rows");
			int n = sc.nextInt();
			p9.pattern(n);
			sc.close();

		}
	}


