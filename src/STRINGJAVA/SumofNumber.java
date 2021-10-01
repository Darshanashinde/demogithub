package STRINGJAVA;

import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		
		int num,sum=0,r;
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");

        num=s.nextInt();
        //System.out.println("Enter the number");
        
        while(num>0) 
        {
          r=num%10;
          sum=sum+r;
          num=num/10;
        	
        }
        System.out.println("Sum of number is "+sum);
	}

}
