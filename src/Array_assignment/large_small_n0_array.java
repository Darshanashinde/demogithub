package Array_assignment;

public class large_small_n0_array {

	public static void main(String[] args) {
		int[] arr= {5, 78, 90, 4, 36, 8, 7};
		
		 int max=arr[0];
		 
		 for (int i=0;i<arr.length;i++)		
		 {
		        if (arr[i]>max)			  
	
				  max=arr[i]; 		 		
          }
			
			System.out.println(" maximum number in array is:" +max);
			
			
			int min =arr[0];
			
			for (int i=0;i<arr.length;i++) {
				
				if (arr[i]<min)
					
					min =arr[i];
				
			}
			System.out.println(" minimum number in array is:" +min);

	}

}
