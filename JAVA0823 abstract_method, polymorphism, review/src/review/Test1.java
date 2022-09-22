package review;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] P = new int	[N][];
		P[0] = new int[1];
		P[1] = new int[2];
		P[2] = new int[3];
		
		for(int i =0; i < P.length; i++) {
			P[i] = new int[i+1];
		}
		
		for(int i = 0; i < P.length; i++) {
			for(int j = 0; j < P[i].length; j++) {
				if(j == 0 || i == j) {
					P[i][j] = 1;
				} else {
					P[i][j] = P[i-1][j] + P[i-1][j-1];
				}
				
			}
			
		}
		
		
		
		
        for(int[] arr : P) {
        	for(int num : arr) {
        		System.out.print(num + " ");
        	}
        	System.out.println();
        }
        
          	
            	
           
         
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
    
}      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	


