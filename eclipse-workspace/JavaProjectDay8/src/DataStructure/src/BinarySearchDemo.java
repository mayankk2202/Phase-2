package DataStructure.src;


public class BinarySearchDemo {
	public int binarySearch(int[] inputArray, int firstIndex, int lastIndex, int valueToSearch) {
		if(lastIndex > firstIndex) {
			int midIndex = firstIndex + (lastIndex - firstIndex) / 2;
			if(inputArray[midIndex] == valueToSearch) {
				return midIndex;
			}
			
			if(inputArray[midIndex] > valueToSearch) {
				return binarySearch(inputArray, firstIndex, midIndex - 1, valueToSearch);
			} else {
				return binarySearch(inputArray, midIndex + 1, lastIndex, valueToSearch);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] intArray = {12, 34, 56, 67, 89};
		BinarySearchDemo demo = new BinarySearchDemo();
		int index = demo.binarySearch(intArray, 0, intArray.length-1, 12);
		System.out.println(index);
		index = demo.binarySearch(intArray, 0, intArray.length-1, 67);
		System.out.println(index);
		index = demo.binarySearch(intArray, 0, intArray.length-1, 112);
		System.out.println(index);
		
	}
}
