package Assignment2practice;

import java.util.Scanner;

public class List_integernum {

	public static void main(String[] args) {
		int L,R;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter L :");
		L = sc.nextInt();
		System.out.println("Enter R :");
		R = sc.nextInt();
		
		System.out.println("All the numbers between L and R are :");
		for(int i=L ; i<=R ; i++)
		{
		  System.out.println(i);
		}		

	}

}
