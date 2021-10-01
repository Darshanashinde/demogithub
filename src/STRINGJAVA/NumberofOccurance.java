package STRINGJAVA;

public class NumberofOccurance {

	public static void main(String[] args) {

		String mystring="Bhuj the pride of India";
		
		int totalcount=mystring.length();
		
		int totalcount_afterremoving=mystring.replace("i","").length();
		
		int count=totalcount-totalcount_afterremoving;
		
		System.out.println("Number occurance of t is: "+count);
	}

}
