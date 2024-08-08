
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
		/*your code here*/
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
	 * Create a NEW 2D int array with numRows rows by numCols columns populated with 1 for each element.
	 * The arrays passed into the function should remain unchanged.
	 * @param numRows - number of rows in the new array
	 * @param numCols - number of columns in the 2D array
	 * @return - return a 2D array with 1s in each element that numRows by numCols
	 */
	public static int [][] create2DArray(int numRows, int numCols) {
		/*your code here*/
		return null;
	}
	
	
	/**
	 * Take an array of integers and find how many different ways those elements 
	 * can be paired. If arr is null return -1.
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
		/*your code here*/
		return null;
	}
	
}