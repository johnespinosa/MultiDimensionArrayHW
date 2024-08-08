
public class MultiDimensionArrayHW {
	public static void main(String[] args) {	

	}


	/**
	 * Create a new 2D int array with numRows rows by numCols columns populated with 1 for each element
	 * @param numRows - number of rows in the new array
	 * @param numCols - number of columns in the 2D array
	 * @return - return a 2D array with 1s in each element that numRows by numCols
	 */
	public static void doubleArray(int [][] arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] *= 2;
			}
		}
	}
	
	/**
	 * Add together two 2-d arrays of the same size. if they're different sizes or either is null return null
	 * @param arr1 - array to add
	 * @param arr2 - another array to add
	 * @return - sum of arrays or null
	 */
	public static int [][] addArrays(int [][] arr1, int [][] arr2) {
		if(arr1 == null || arr2 == null || arr1.length != arr2.length || 
				arr1[0].length != arr2[0].length )
			return null;
		
		int [][] resultArr = new int [arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				resultArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return resultArr;
	}
	
	
	/**
	 * Create a NEW 2D int array with numRows rows by numCols columns populated with 1 for each element.
	 * The arrays passed into the function should remain unchanged.
	 * @param numRows - number of rows in the new array
	 * @param numCols - number of columns in the 2D array
	 * @return - return a 2D array with 1s in each element that numRows by numCols
	 */
	public static int [][] create2DArray(int numRows, int numCols) {
		if(numRows < 1 || numCols < 1)
			return null;
		int [][] newArr = new int [numRows][numCols];
		for(int row = 0; row < numRows; row++)
			for(int col = 0; col < numCols; col++)
				newArr[row][col] = 1;
		return newArr;
	}
	
	
	/**
	 * Take an array of integers and find how many different ways those elements 
	 * can be paired. If arr is null return -1.
	 * @param arr - an array of integers
	 * @return - the number of ways elements of arr can be paired
	 */
	public static int countNumPairs(int [] arr) {
		if(arr == null)
			return -1;
		int numPairs = 0;
		for(int firstIndex = 0; firstIndex < arr.length; firstIndex++) {
			// pair with numbers after the 1st number in the pair
			for(int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++){
				numPairs++;
			}
			System.out.println(); // put pairs with a different first item in a new line
		}
		return numPairs;
	}
	
	/**
	 * List all possible pairings of numbers in an array using a 2-d array
	 * where the first index is the index of the pair, the second index 0 is the first element
	 * in the pair and the second index being 1 is the second element of the pair.
	 * Pairs should always have the smallest element in the pair be in the first position
	 * 
	 * for example 1, 2, 3, 4
	 * Would have the pairs
	 *  {{1,2},{1,3},{1,4},{2,3},{2,4}, {3,4}}
	 * 
	 * the pairs can be in any order but the elements of the pair must be in non-decreasing 
	 * order. For example {2,1} is a bad pair
	 * 
	 * the returned array should be the smallest size possible to solve the problem.
	 * @param arr - an array of integers
	 * @return - all possible pairs of the integers in arr in a new 2-d array
	 */
	public static int[][] getPairs(int [] arr) {
		if(arr == null)
			return null;
		int numPairs = countNumPairs(arr);
		int [][] pairs = new int [numPairs][2];
		
		int pairIndex = 0;
		for(int firstIndex = 0; firstIndex < arr.length - 1; firstIndex++) {
			for(int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
				int firstNumInPair = arr[firstIndex];
				int secondNumInPair = arr[secondIndex];
				pairs[pairIndex][0] = firstNumInPair;
				pairs[pairIndex][1] = secondNumInPair;
				pairIndex++;
			}
		}	
		return pairs;
	}
	
}
