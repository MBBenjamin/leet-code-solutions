package com.leetcode.mbbenjamin.solutions;

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

}
