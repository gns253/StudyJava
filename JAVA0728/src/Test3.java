public class Test3 {

	public static void main(String[] args) {
		
		int n = 3;
		int[][] square = new int[n][n]; 
		
		int row = 0;
		int col = n/2;
		for(int i = 1; i <= n*n; i++) {
			square[row][col] = i;
			if(i % n == 0) { 
				row++;
			} else {
				row--;
				col++;
			}
			if(row < 0) row = n-1;
			if(col > n-2) col = 0;
			
		}
		
		for(int i = 0; i <square.length; i++) {
			
			for(int j = 0; j < square[i].length; j++) {
				System.out.print(square[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
