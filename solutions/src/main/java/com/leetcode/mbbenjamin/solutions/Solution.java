package com.leetcode.mbbenjamin.solutions;

import java.util.HashMap;

public class Solution {

	/**
	 * Method that converts a Roman numeral to an int value
	 * 
	 * @param s
	 * @return int value for the numeral
	 */
	public int romanToInt(String s) {

		// Stores the sum
		int intNumber = 0;
		// stores the current roman numeral
		int romanNumeral;
		// stores the roman numeral on the right to evaluate if a subtraction is needed
		int romanNumeralOnTheRight;

		// Iterates over the individual roman numerals
		for (int i = 0; i < s.length(); i++) {
			romanNumeral = romanValue(s.charAt(i));

			// If there is still a char on the right
			if (i + 1 < s.length()) {
				romanNumeralOnTheRight = romanValue(s.charAt(i + 1));

				// comparing current char with the one on the right
				if (romanNumeral >= romanNumeralOnTheRight) {
					// the value of the current char is equal or greater than the next char
					intNumber = intNumber + romanNumeral;
				} else {
					// the value of the current char is smaller than the next char
					intNumber = intNumber - romanNumeral;
				}
				// no more chars on the right
			} else {
				intNumber = intNumber + romanNumeral;
			}

		}

		System.out.println(intNumber);
		return intNumber;
	}

	/**
	 * Method that returns the int value for a single Roman Numeral
	 * 
	 * @param romanChar
	 * @return int value
	 */
	int romanValue(char romanChar) {
		switch (romanChar) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	public int[] twoSum(int[] nums, int target) {

		// Result array
		int[] result = new int[2];

		// Stores the number as key and the index as value
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterates over the nums array
		for (int i = 0; i < nums.length; i++) {
			Integer number = nums[i];
			if (!map.containsKey(number)) {
				// stores the value / index
				map.put(number, Integer.valueOf(i));
			} else {

			}
			// Doesn't need to compare with others since it's the 1st value
			if (map.size() > 1) {

			}
		}

		return result;
	}

}
