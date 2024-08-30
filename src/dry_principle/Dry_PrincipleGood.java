package dry_principle;

public class Dry_PrincipleGood {

	public static void display(int [][] a)
	{
		// print matrix 
		for (int i = 0; i < a.length; i++) { 
			for (int j = 0; j <a[i].length; j++) { 
				System.out.print(a[i][j] + " "); 
			} 
			System.out.println(); 
		} 
	}
	public static void main(String[] args) {


		// cerate 4x4 matrix with values 
		int[][] matrix = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } };
		// printing 
		display(matrix);

		// create 5x5 matrix with values 
		int[][] matrix2 = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 }, 
				{ 21, 22, 23, 24, 25 } };
		//print 
		display(matrix2);


	} 
}
