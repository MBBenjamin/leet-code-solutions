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

	/**
	 * Method that receives an array of numbers along with a target value, and will
	 * look for the first two numbers inside the array that equals the target when
	 * summed.
	 * 
	 * LeetCode <a href="https://leetcode.com/problems/two-sum/">link for the problem</a>
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {

		// Result array
		int[] result = new int[2];

		// Stores the number as key and the index as value
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterates over the nums array
		for (int i = 0; i < nums.length; i++) {
			Integer currNumber = nums[i];
			
			// Checks what's the desired number to sum with the current one
			Integer desiredNumber = target - currNumber;
			
			// and checks if the hashMap contains it, making sure it's not the current entry
			if (map.containsKey(desiredNumber) && map.get(desiredNumber) != i) {
				// Gets the index from the desired number from the Map
				result[0] = map.get(desiredNumber).intValue();
				// Gets the index from the current number from the loop variable 'i'
				result[1] = i;
				break;
			}
			
			if (!map.containsKey(currNumber)) {
				// stores the value / index
				map.put(currNumber, Integer.valueOf(i));
			}
		}

		return result;
	}

}
