package practice_program;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int rows=sc.nextInt();
		//System.out.println("Enter the no of rows :");
		
		for(int i =1;i<=rows;i++){
			
		for(int j=1;j<=i;j++) {
			
			System.out.print("*");
		}	
			
		//for(int k=0;k<=i;k++) {
			
			//System.out.print("*");
		//}
		
		System.out.println("");
		}
		
		for(int i=1;i<=rows;i++) {
			//print stars in decreasing order
			for(int j=rows-1;j>=i;j--) {
				
				System.out.print("*");
			}
			// to print increasing order
			for(int k=1;k<=i;k++) {
				
				System.out.print("");
			}
			
			System.out.println("");
		}
		sc.close();
	}

}
