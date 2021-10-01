package Array_assignment;

public class secondlargest__no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] arr= {8,3,5,7,1,9,10,14};
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++ ){
				
				if(arr[i]<arr[j]) {
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.println("second largest element in array :"+ temp);
		}
		System.out.println("second largest element in array :"+ arr[1]);

	}

}
