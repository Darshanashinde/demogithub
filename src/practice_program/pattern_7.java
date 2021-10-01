package practice_program;

import java.util.Scanner;

public class pattern_7 {

	public static void main(String[] args) {
  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			//print space inn decreasing ordr
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}
		//star in increasing order	
		for(int k=1;k<=i;k++) {
			
			System.out.print("*");
		}
		
		System.out.println("");
		}
		
		for(int i=1;i<=rows-1;i++) {
			//print space in increasing order
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			//print star in decreasing order
		for(int k=rows-1;k>=i;k--) {
			
			System.out.print("*");
		}
		
		System.out.println("");
		}
		sc.close();
	}

}
