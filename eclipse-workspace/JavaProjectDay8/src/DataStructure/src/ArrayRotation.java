package DataStructure.src;


public class ArrayRotation {
	public static void main(String[] args) {
		int[] originalArray = new int[] {1, 2, 3, 4, 5, 6};
		System.out.println("Before shift: ");
		for (int i = 0; i < originalArray.length; i++) {
			System.out.print(originalArray[i] + " ");
		}
		int numberOfShifts = 3;
		
		for(int i=0; i<numberOfShifts; i++) {
			int lastElement = originalArray[originalArray.length - 1];
			for(int j=originalArray.length-1; j>0; j--) {
				originalArray[j] = originalArray[j-1];
			}
			originalArray[0] = lastElement;
		}
		System.out.println();
		System.out.println("After shift: ");
		for (int i = 0; i < originalArray.length; i++) {
			System.out.print(originalArray[i] + " ");
		}
	}
}
