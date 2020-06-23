import java.util.Arrays;
import java.util.Scanner;

class Sorting {

    void sortIntegers(int[] nums) {
    	int[] sortedArr = nums.clone();
    	boolean isSorted = false; // best practice is to set boolean values to the default which is false
    	int temp = 0;
    	while(!isSorted) {
    		isSorted = true; // we will assume best case scenario, i.e. the int array is sorted
	    	for(int i = 0; i < sortedArr.length - 1; i++) {
	    		if(sortedArr[ i ] < sortedArr[ i + 1 ] ) {
	    			isSorted = false; // when finding out of order we must change our boolean to false
	    			temp = sortedArr[i];
	    			sortedArr[i] = sortedArr[i + 1];
	    			sortedArr[ i + 1] = temp;
	    		}
	    	}
    	}
    	System.out.println("We now have sorted your numbers (descending order) below:");
    	printNums(sortedArr);
    }

    void printNums(int[] arr) {
    	System.out.println(Arrays.toString(arr));
    }

    int[] getNums() {
        Scanner scanner = new Scanner(System.in);
    	System.out.println("Please provide how many integers to sort through:");
        int quantity = scanner.nextInt();
    	
        System.out.println("Please give input of " +
                quantity + " numbers below:");
        
        int[] arr = new int[quantity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    void reverse(int[] numbers) {
    	int arrLen = numbers.length;
    	int maxIndex = arrLen - 1;
    	int halfLength = arrLen / 2;
    	int temp = 0;
    	for (int i = 0; i < halfLength; i++) {
			temp = numbers[i];
			numbers[i] = numbers[maxIndex - i];
			numbers[maxIndex - i] = temp;
		}
    	System.out.println("We now have your original set of numbers in reverse order below");
    	System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");
        Sorting sorting = new Sorting();
        int[] arr = sorting.getNums();
        System.out.println("Numbers given below:");
        sorting.printNums(arr);
        sorting.sortIntegers(arr);
        sorting.reverse(arr);
    }

}
