package DataStructure.src;


public class LinearSearchDemo {
	public static void main(String[] args) {
		int[] intArray = new int[] {12, 45, 67, 78, 34, 90, 35, 16, 85, 35, 38, 46};
		int index,value;
		int count =0;
		value = 35;
		
		// search if 34 is available in the array
		for(index=0; index<intArray.length; index++) {
			if(intArray[index] == value) {
				count++;
			}
		}
		System.out.println(value + " is found " + count + " times.");
		if(index == intArray.length && count == 0) {
			System.out.println("Element not found");
		}
	}
}
