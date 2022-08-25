package com.leetcode.mbbenjamin.solutions;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void testRomanToInt() {
		Solution solution = new Solution();
		Assert.assertEquals(1155, solution.romanToInt("LXVMC"));
		Assert.assertEquals(3, solution.romanToInt("III"));
		Assert.assertEquals(58, solution.romanToInt("LVIII"));
		Assert.assertEquals(1994, solution.romanToInt("MCMXCIV"));
		Assert.assertTrue(true);
	}
	
	@Test
	public void testTwoSum() {
		Solution solution = new Solution();
		int[] nums1 = {2,7,11,15};
		int[] nums2 = {3,2,4};
		int[] nums3 = {3,3};
		int[] nums4 = {4,5,7,3,15,48,632};
		
		int[] expected1 = {0,1};
		int[] expected2 = {1,2};
		int[] expected3 = {0,1};
		int[] expected4 = {4,5};
		
		int[] result1 = solution.twoSum(nums1, 9);
		int[] result2 = solution.twoSum(nums2, 6);
		int[] result3 = solution.twoSum(nums3, 6);
		int[] result4 = solution.twoSum(nums4, 63);
		
		for (int index : result1) {
			Assert.assertTrue(arrayContainsNumber(expected1, index));
		}
		for (int index : result2) {
			Assert.assertTrue(arrayContainsNumber(expected2, index));
		}
		for (int index : result3) {
			Assert.assertTrue(arrayContainsNumber(expected3, index));
		}
		for (int index : result4) {
			Assert.assertTrue(arrayContainsNumber(expected4, index));
		}
	}
	
	/**
	 * Returns true if a number is contained inside an array
	 * @param array
	 * @param number
	 * @return
	 */
	private boolean arrayContainsNumber(int[] array, int number) {
		for (int num : array) {
			if (num == number) {
				return true;
			}
		}
		return false;
	}

}
