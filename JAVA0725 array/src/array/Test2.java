package array;

public class Test2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 2, 1};
		
		for(int i = 0; i < arr.length; i++) {
			
			int target = arr[i];
			System.out.print(i+1 + ": ");
			
			for(int j = 0; j < arr.length; j++) {
				
				int num = arr[j];
				
				if(i == j)
					continue;
				
				if(target < num) 		System.out.print("< ");
				else if(target > num) 	System.out.print("> ");
				else 					System.out.print("= ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
