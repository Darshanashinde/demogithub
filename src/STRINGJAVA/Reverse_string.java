package STRINGJAVA;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Mystring="there is an apple";
		
		int length = Mystring.length();
		
		String rev ="";
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+Mystring.charAt(i);
			
		}
		
		
		System.out.println("reverse of string " +Mystring+ " is");
		
		System.out.println(" "+rev);
		
		
	}

}
