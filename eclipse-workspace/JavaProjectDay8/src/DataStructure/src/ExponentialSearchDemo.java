package DataStructure.src;


public class ExponentialSearchDemo {
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
	
	public int exponentialSearch(int inputArray[],int n, int searchValue) {
		if(inputArray[0] == searchValue) {
			return 0;
		}
		
		int i = 1;
		while(i < n && inputArray[i] <= searchValue) {
			i = i * 2;
		}
		
		return binarySearch(inputArray, (i/2), Math.min(i, n), searchValue);
	}
	
	public static void main(String[] args) {
		int[] intArray = {12, 34, 56, 67, 89};
		ExponentialSearchDemo demo = new ExponentialSearchDemo();
		int result = demo.exponentialSearch(intArray, intArray.length, 67);
		System.out.println(result);
		result = demo.exponentialSearch(intArray, intArray.length, 12);
		System.out.println(result);
		result = demo.exponentialSearch(intArray, intArray.length, 671);
		System.out.println(result);
	}
}












