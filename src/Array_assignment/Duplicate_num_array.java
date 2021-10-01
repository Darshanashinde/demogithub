package Array_assignment;

public class Duplicate_num_array {

	public static void main(String[] args) {

		int[] arr= new int[] {10,5,18,5,9,6,10,11};
		
		System.out.println("Duplicate elements in Array");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
				}
				
			}
		}
	
	}

}
