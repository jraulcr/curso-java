/**
 * 
 */

/**
 * @author Mabera
 *
 */
public class ArraysBidimensionales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int [][] matrix = new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=50;
		matrix[0][2]=25;
		matrix[0][3]=85;
		matrix[0][4]=155;

		matrix[1][0]=64;
		matrix[1][1]=82;
		matrix[1][2]=35;
		matrix[1][3]=10;
		matrix[1][4]=39;
		
		matrix[2][0]=60;
		matrix[2][1]=95;
		matrix[2][2]=92;
		matrix[2][3]=58;
		matrix[2][4]=39;
		
		matrix[3][0]=94;
		matrix[3][1]=23;
		matrix[3][2]=31;
		matrix[3][3]=85;
		matrix[3][4]=4 ;*/
		
		int [][] matrix = {
				{15, 50, 25, 85, 155},
				{64, 82, 35, 10, 39},
				{60, 95, 92, 58, 39},
				{94, 23, 31, 85, 4}				
		};
		
		
		for (int[] fila : matrix) {
			System.out.println(	);
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}
		
		
		
	/*	for (int i = 0; i < 4; i++) {//Recorre primera d imension
			System.out.println();
			for (int j = 0; j < 5; j++) {//Recorre la segunda dimension
				
				System.out.print(matrix[i][j] + " "); 
			}
			
		}*/
		
	}

}
