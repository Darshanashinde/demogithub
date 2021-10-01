package Assignment2practice;

import java.util.Scanner;

public class Add_corresponding_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of two arrays ");
		int size = sc.nextInt();
		
		int a1[] = new int[size];
		int a2[] = new int[size];
		int sum[] = new int[size];
		
		System.out.println("Enter the elements of arr1 : ");
		for(int i=0 ; i<size ; i++)
		{
			a1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements of arr2 : ");
		for(int i=0 ; i<size ; i++) 
		{
			a2[i] = sc.nextInt();
		}
		
		System.out.println("Sum of elements of arr1 and arr2 are : ");
	
		for(int i=0 ; i<size ; i++)
		{
			sum[i] = a1[i]+a2[i];		
			System.out.println(sum[i]);
		}

	}

}
