package Array_assignment;

import java.util.Scanner;

public class check_value_array {

	public static void main(String[] args) {

		int[] arr= {3,2,7,9,10,12,17,19};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int value= sc.nextInt();
		boolean check=false;
		
		for(int i:arr) {
			
			if(i==value) {
				check = true;
				break;
				
			}
		}
		
		if(check) {
			System.out.println("The element is present in array :" + value);
		}
		else {
			
			System.out.println("The element is not present in array :" +value);
		}
		
		sc.close();
	}

}
