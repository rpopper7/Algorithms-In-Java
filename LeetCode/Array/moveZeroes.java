/* ------------------------------------------------------------- 
 * 283.  Move Zeroes
 * -------------------------------------------------------------
 * Given an array nums, write a function to move all 0's to the 
 * end of it while maintaining the relative order of the non-
 * zero elements.  
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your
 * function, nums should be [1, 3, 12, 0, 0].
 *
 * NOTE: 
 * 		1. You must do this in-place without making a copy of 
 * 		   the array.
 * 		2. Minimize the total number of operations.
 * -------------------------------------------------------------
 */

public class Solution
{
	public String moveZeroes(int[] nums)
	{
		int count = 0; 

		// Put non-zero elements to the front of array
		// using pointer count.
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != 0)
			{
				nums[count] = nums[i];
				count++;
			}
		}

		// Make all elements 0 from count to the end 
		for (int i = count; i < nums.length; i++)
		{
			nums[i] = 0;
		}
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * This solution uses a two pointer system, one pointer traverses
 * the array and the other adds values in-place to the front of
 * the array if the first pointer finds a non-zero element.
 * -------------------------------------------------------------
 */