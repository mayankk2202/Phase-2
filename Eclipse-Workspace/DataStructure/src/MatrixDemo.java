


public class MatrixDemo {
	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[][] matrix2 = {{11, 12, 13},{14, 15, 16},{17, 18, 19}};
		
		int[][] resultMatrix = new int[3][3];
		System.out.println("Addition: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(resultMatrix[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		System.out.println("Subtraction: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				resultMatrix[i][j] = matrix2[i][j] - matrix1[i][j];
				System.out.print(resultMatrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
