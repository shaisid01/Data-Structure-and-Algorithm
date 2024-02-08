/* 
 217.Contains Duplicates
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		Example 1:
		Input: nums = [1,2,3,1]
		Output: true
		
		Example 2:
		Input: nums = [1,2,3,4]
		Output: false
		
		Example 3:
		Input: nums = [1,1,1,3,3,4,3,2,4,2]
		Output: true
 */

package Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
	
	/* Using Sort 
	 * 
    Time complexity: O(nlog(n))
    Space complexity: O(log(n))
	 */
	public static boolean containsDupsSort(int[] nums){
		Arrays.sort(nums);
		for(int i=0;i<(nums.length - 1);i++) {
			if (nums[i] == nums[i+1]) return true;
		}
		return false;
	}
	
	public static boolean containsDupsHashmap(int[] nums) {
	
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for (int n: nums) {
			if (map.containsKey(n)) return true;
			map.put(n, 1);
		}
			return false;
	}
	
	public static boolean containsDupsHashSet(int[] nums) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int n: nums) {
			if (set.contains(n)) return true;
			set.add(n);
		}
		return false;
	}

	public static void main(String[] args) {
		boolean result;
		int[] nums = {1,2,3,1};
		
		/*
		result = containsDupsSort(nums);
		System.out.println("nums = {1,2,3,1} " + result);

		nums = new int[]{1,2,3,4};
		result = containsDupsSort(nums);
		System.out.println("\n nums = {1,2,3,4} " + result);
		
		result = containsDupsSort(new int[]{1,1,1,3,3,4,3,2,4,2});
		System.out.println("\n nums = {1,1,1,3,3,4,3,2,4,2} " + result);
		*/
		
		/*
		result = containsDupsHashmap(nums);
		System.out.println("nums = {1,2,3,1} " + result);

		nums = new int[]{1,2,3,4};
		result = containsDupsHashmap(nums);
		System.out.println("\n nums = {1,2,3,4} " + result);
		
		result = containsDupsHashmap(new int[]{1,1,1,3,3,4,3,2,4,2});
		System.out.println("\n nums = {1,1,1,3,3,4,3,2,4,2} " + result);
		
		*/
		
		result = containsDupsHashSet(nums);
		System.out.println("nums = {1,2,3,1} " + result);

		nums = new int[]{1,2,3,4};
		result = containsDupsHashSet(nums);
		System.out.println("\n nums = {1,2,3,4} " + result);
		
		result = containsDupsHashSet(new int[]{1,1,1,3,3,4,3,2,4,2});
		System.out.println("\n nums = {1,1,1,3,3,4,3,2,4,2} " + result);
		

	}

}
