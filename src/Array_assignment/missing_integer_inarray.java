package Array_assignment;

public class missing_integer_inarray {

	public static void main(String[] args) {
		
      int[] arr= {1,2,3,4,5,7,8,9,10};
      
      int exp_num_of_element=arr.length+1;
      
      int total_sum=exp_num_of_element*(exp_num_of_element+1)/2;//10*(10+1)/2=55
      
      int sum=0;
      for(int i=0;i<arr.length;i++) {
    	  
    	  sum=sum+arr[i];//it will give sum of array =49
      }
      
      
      System.out.println("Missing number in Array is:" + (total_sum-sum));//55-49=6
	}

}
