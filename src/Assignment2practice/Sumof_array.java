package Assignment2practice;

public class Sumof_array {

	public static void main(String[] args) {
		
		int a[]= {3,6,9,15,10,2};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) 
		{
			sum=sum+a[i];
				
		}
    
		System.out.println("The sum of array is : "+sum);
	}

}
