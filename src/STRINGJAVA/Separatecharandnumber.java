package STRINGJAVA;

import java.util.Scanner;

public class Separatecharandnumber {

	public static void main(String [] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string contains number and charachter");
		
	String sentance	=s.next();
		
	System.out.println("The number part is:" +sentance.replaceAll("[^0-9]","") + "The char part is:"+sentance.replaceAll("[0-9]",""));
		
	}

}
