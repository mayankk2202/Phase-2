
public class MultiDimArray {

	   public static void main(String[] args) {
	        int[][] twoDimArray = new int[3][4];
	        for (int i = 0; i < twoDimArray.length; i++) {
	            for (int j = 0; j < twoDimArray[i].length; j++) {
	                twoDimArray[i][j] = i + j * 10;
	            }
	        }
	        
	        for (int i = 0; i < twoDimArray.length; i++) {
	            for (int j = 0; j < twoDimArray[i].length; j++) {
	                System.out.println(twoDimArray[i][j]);
	            }
	        }
	    }
}
