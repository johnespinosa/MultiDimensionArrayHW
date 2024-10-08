
public class MultiDimensionArrayHW {
	public static void main(String[] args) {	
		
	}


	/**
	 * Create a NEW 2D int array with numRows rows by numCols columns populated with 1 for each element.
	 * The arrays passed into the function should remain unchanged.
	 * @param numRows - number of rows in the new array
	 * @param numCols - number of columns in the 2D array
	 * @return - return a 2D array with 1s in each element that numRows by numCols
	 */
	public static int [][] create2DArray(int numRows, int numCols) {
		
		int [][] arr = new int[numRows][numCols];
		for(int row = 0; row < numRows; row++) {
			for(int column = 0; column < numCols; column++) {
				arr[row][column] = 1;
			}
		}
		
		return arr;
	}
	
	/**
	 * Pass in an array of integers and double each of the values in 
	 * the array that was passed in. Nothing is returned.
	 * You can assume arr has the same number of columns in each row
	 * @param arr - array to double the values of
	 */
	public static void doubleArray(int [][] arr) {

		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++) {
				arr[row][column] *= 2;
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
		/*your code here*/
		return null;
	}
	
	
	/**
	 * Take an array of integers and find how many different ways those elements 
	 * can be paired. If arr is null return -1.
         * You can assume arr will not repeat elements {1,1,2} will not be passed in. 
	 * @param arr - an array of integers
	 * @return - the number of ways elements of arr can be paired
	 */
	public static int countNumPairs(int [] arr) {
		/*your code here*/
		return -10;
	}
	
	/**
	 * See if a pair (a,b) exists in a pairs array. assumes a <= b and that each 
	 * pair in pairs has has the same constraint
	 * @param a - first element in the pair
	 * @param b - second element in the pair
	 * @param pairs - list of pairs
	 * @return true if (a,b) is in pairs, false otherwise.
	 */
	public static boolean pairExists(int a, int b, int [][] pairs) {
		/*your code here*/
		return false;
	}
	
	
	// the power set of {a,b,c} is {{},{a},{b},{c}, {a,b}, {b,c}, {a,c}, {a,b,c}}
	
	/**
	 * List all possible pairings of numbers in an array using a 2-d array
	 * where the first index is the index of the pair, the second index (1) is the first element
	 * in the pair and the third index (2) is the second element of the pair.
	 * Pairs should always have the smallest element in the pair be in the first position
	 * You can assume that no number in the input int array is repeated. for example 1,2,2,3 
         * would not be given to you. 
	 * valid example: {1, 2, 3, 4}
	 * Would have the pairs
	 *  {{1,2},{1,3},{1,4},{2,3},{2,4}, {3,4}}
         *  pairs[0][0] -> 1
	 *  pairs[0][1] -> 2
	 * the pairs can be in any order but the elements of the pair must be in non-decreasing 
	 * order. For example {2,1} is a bad pair
	 * 
	 * the returned array should be the smallest size possible to solve the problem.
	 * @param arr - an array of integers
	 * @return - all possible pairs of the integers in arr in a new 2-d array
	 */
	public static int[][] getPairs(int [] arr) {
		/*your code here*/
		return null;
	}
	
}
