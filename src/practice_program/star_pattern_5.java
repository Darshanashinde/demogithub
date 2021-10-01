package practice_program;

public class star_pattern_5 {

	public static void main(String[] args) {

		for(int i=5;i>=1;i--) {
			//for decreasing order
			for(int j=1;j<=(i*2)-1;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			//increasing order
			for(int k=5;k>=i;k--) {
				
				System.out.print(" ");
				
			}
		}
	}

}
