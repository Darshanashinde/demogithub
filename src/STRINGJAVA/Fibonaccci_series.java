package STRINGJAVA;

import java.util.Scanner;

public class Fibonaccci_series {

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to get fabonacci series");
		int num =s.nextInt();
		
		for (int i=1;i<=num;i++) {
			
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
