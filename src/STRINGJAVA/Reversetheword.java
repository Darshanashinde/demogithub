package STRINGJAVA;

import java.util.Scanner;

public class Reversetheword {

	public static void main(String[] args) {
    //Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the sentance");
     //String str=sc.next();
		String str="Welcome to Neosoft";
     
     String[]words=str.split(" ");//spliting string into words
     String reverseString="";
     
     for(String w:words)
     {
    	 
    	 String reverseword="";
    	 
    	 for(int i=w.length()-1;i>=0;i--)
    	 {
    		 reverseword=reverseword+w.charAt(i);
    		 
    	 }
    	 reverseString=reverseString+reverseword+"";
     }
     System.out.println("the reverse of string is:"+reverseString);
    // System.out.println(reverseString);
	}

}
