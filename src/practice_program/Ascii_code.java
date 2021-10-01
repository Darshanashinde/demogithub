package practice_program;

import java.util.Scanner;

public class Ascii_code {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charater");
		char chr=sc.next().charAt(0);
        int Asciivalue=chr;
        
        System.out.println("Ascii Value of "+chr+" is :"+Asciivalue);
	}

}
