package STRINGJAVA;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args ) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check number is armstrong or not");
       int no=s.nextInt();
       int n1=no;
       int length=0;

       
       while(n1!=0) {
    	   
    	       length=length+1;
    	       n1=n1/10;
    	       
                    }
       
       int n2=no;
       int arm=0;
       int rem;
       while (n2!=0) {
    	           
    	           int mul=1;
    	           rem =n2%10;
    	      
    	      for(int i=1;i<=length;i++) 
    	      {
    	    	  mul=mul*rem;
    	    	  
    	    	  }
    	      arm=arm+mul;
    	       n2=n2/10;
       }  
       if(arm==no) {
    	   
    	   System.out.println(no+ " is armstrong number");
    	   
              }
       else {
    	   
    	   System.out.println(no+"is not armstrong number");
       }
       
	}

}
