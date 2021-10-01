package practice_program;

import java.util.Scanner;

public class pattern_8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows");
		
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			//to print space in dec order
			for(int j=rows;j>i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=(i*2)-1;k++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}
          
		for(int i= rows-1;i>=1;i--) {
			
			for(int j=rows-1;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=(i*2)-1;k++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
	}

}
