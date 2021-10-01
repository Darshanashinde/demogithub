package STRINGJAVA;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num,rem,rev=0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number for reverse number");
		num=s.nextInt();
		
		while(num !=0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
     System.out.println(rev);
	}

}
