import org.junit.Test;
import org.junit.Assert;

public class TestMultiDimensionArrayHW {

	@Test
	public void testCountPairs() {
		int [] myArr = {1,2,3,4};
		int numPairs = MultiDimensionArrayHW.countNumPairs(myArr);
		Assert.assertEquals(6, numPairs);
	}
	
	@Test
	public void testcountPairsNull() {
		int [] myArr = null;
		int numPairs = MultiDimensionArrayHW.countNumPairs(myArr);
		Assert.assertEquals(-1, numPairs);
	}
	
	@Test
	public void testCreateArray3By4() {
		int [][] myArr = MultiDimensionArrayHW.create2DArray(3,4);
		Assert.assertEquals(3, myArr.length);
		Assert.assertEquals(4, myArr[0].length);
		for(int i = 0; i < myArr.length; i++)
			for(int j = 0; j < myArr.length; j++)
				Assert.assertEquals(1, myArr[i][j]);
	}
	
	@Test
	public void testCreateArrayBadDimensions() {
		int [][] myArr = MultiDimensionArrayHW.create2DArray(-1,4);
		Assert.assertNull(myArr);
	}
	
	@Test
	public void testDoubleArray() {
		int [][] myArr = MultiDimensionArrayHW.create2DArray(3,4);
		MultiDimensionArrayHW.doubleArray(myArr);
		Assert.assertEquals(3, myArr.length);
		Assert.assertEquals(4, myArr[0].length);
		for(int i = 0; i < myArr.length; i++)
			for(int j = 0; j < myArr.length; j++)
				Assert.assertEquals(2, myArr[i][j]);
	}
	
	@Test
	public void testDoubleArrayNull() {
		MultiDimensionArrayHW.doubleArray(null);
	}
	
	@Test
	public void testAddArrays() {
		int [][] arr1 = MultiDimensionArrayHW.create2DArray(3,4);
		MultiDimensionArrayHW.doubleArray(arr1);
		
		int [][] arr2 = MultiDimensionArrayHW.create2DArray(3,4);

		int [][] sumArr = MultiDimensionArrayHW.addArrays(arr1, arr2);
		
		// new array is created
		Assert.assertTrue(arr1 != sumArr && arr2 != sumArr);
		
		// arr1 is unchanged
		for(int i = 0; i < arr1.length; i++)
			for(int j = 0; j < arr1.length; j++)
				Assert.assertEquals(2, arr1[i][j]);
		
		// arr2 is unchanged
		for(int i = 0; i < arr2.length; i++)
			for(int j = 0; j < arr2.length; j++)
				Assert.assertEquals(1, arr2[i][j]);
		
		// sum is correct
		for(int i = 0; i < sumArr.length; i++)
			for(int j = 0; j < sumArr.length; j++)
				Assert.assertEquals(3, sumArr[i][j]);
		
	}
	
	@Test
	public void testAddArraysNullValues() {
		int [][] arr1 = MultiDimensionArrayHW.create2DArray(3,4);
		MultiDimensionArrayHW.doubleArray(arr1);
		
		int [][] arr2 = MultiDimensionArrayHW.create2DArray(3,4);

		Assert.assertNull(MultiDimensionArrayHW.addArrays(null, arr2));
		Assert.assertNull(MultiDimensionArrayHW.addArrays(arr1, null));
	}
	
	@Test
	public void testAddArraysIncorrectDimensions() {
		int [][] arr1 = MultiDimensionArrayHW.create2DArray(3,4);
		MultiDimensionArrayHW.doubleArray(arr1);
		
		int [][] arr2 = MultiDimensionArrayHW.create2DArray(3,3);

		Assert.assertNull(MultiDimensionArrayHW.addArrays(arr1, arr2));
	}
	
	@Test
	public void testPairExists() {
		int [][] pairs = {{1,2},{2,2}};
		int [][] otherPairs = {{2,2}};
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,2,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(2,2,pairs));
		Assert.assertFalse(MultiDimensionArrayHW.pairExists(2,3,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(2,2,otherPairs));
		Assert.assertFalse(MultiDimensionArrayHW.pairExists(2,3,otherPairs));
	}
	
	@Test
	public void testGetPairs() {
		int [] myArr = {1,2,3,4};
		int numPairs = MultiDimensionArrayHW.countNumPairs(myArr);
		int [][] pairs = MultiDimensionArrayHW.getPairs(myArr);
		Assert.assertEquals(numPairs, pairs.length);
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,2,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,3,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,4,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(2,3,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(2,4,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(3,4,pairs));
	}
	
	public void testGetPairs2() {
		int [] myArr = {1,4,3,2};
		int numPairs = MultiDimensionArrayHW.countNumPairs(myArr);
		int [][] pairs = MultiDimensionArrayHW.getPairs(myArr);
		Assert.assertEquals(numPairs, pairs.length);
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,2,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,3,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(1,4,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(2,3,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(2,4,pairs));
		Assert.assertTrue(MultiDimensionArrayHW.pairExists(3,4,pairs));
	}
	
	@Test
	public void testGetPairsNull() {
		Assert.assertNull(MultiDimensionArrayHW.getPairs(null));
	}

}
