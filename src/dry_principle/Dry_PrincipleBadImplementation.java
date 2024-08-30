package dry_principle;

public class Dry_PrincipleBadImplementation {
	public static void main(String[] args) {


		// cerate 4x4 matrix with values 
		int[][] matrix = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } }; 
		// print matrix 
		System.out.println("Matrix1: "); 
		for (int i = 0; i < 4; i++) { 
			for (int j = 0; j < 4; j++) { 
				System.out.print(matrix[i][j] + " "); 
			} 
			System.out.println(); 
		} 

		// create 5x5 matrix with values 
		int[][] matrix2 = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 }, 
				{ 21, 22, 23, 24, 25 } }; 
		// print matrix 
		System.out.println("Matrix2: "); 
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5; j++) { 
				System.out.print(matrix2[i][j] + " "); 
			} 
			System.out.println(); 
		} 
	} 
}
