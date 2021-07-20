


public class TwoDimArray {
	public static void main(String[] args) {
		int[][] twoDArray = new int[3][3];
		
		for(int row=0; row<twoDArray.length; row++) {
			for(int col=0; col<twoDArray[row].length;col++) {
				twoDArray[row][col] = row + col * 10;
			}
		}
		
		for(int row=0; row<twoDArray.length; row++) {
			for(int col=0; col<twoDArray[row].length;col++) {
				System.out.println("twoDArray["+row+"]["+col+"] : " +twoDArray[row][col]);
			}
		}
	}
}
