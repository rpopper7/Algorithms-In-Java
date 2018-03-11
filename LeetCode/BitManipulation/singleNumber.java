/* ------------------------------------------------------------- 
 * 136.  Single Number
 * -------------------------------------------------------------
 * Given an array of integers, every element appears twice except
 * for one.  Find that single one.
 *
 * NOTE:  Your algorithm should have a linear runtime complexity.
 * Can you implement it without extra memory?
 * -------------------------------------------------------------
 */

public class Solution
{
	public int singleNumber(int[] nums)
	{
		int result = 0; 

		for (int i = 0; i < nums.length; i++)
		{
			result ^= nums[i];
		}

		return result;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * This solution uses the XOR operator, which returns true if one
 * bit or the other is 1, but not both, and not if both are 0.  
 * This solution picks the odd number out like this: 
 * 2 ^ 1 ^ 4 ^ 5 ^ 2 ^ 4 ^ 1
 * 2 ^ 2 ^ 1 ^ 1 ^ 4 ^ 4 ^ 5	rearrange
 * 0 ^ 0 ^ 0 ^ 0 ^ 5			do XOR of 2 same numbers
 * 0 ^ 5						XOR 0 with unique number
 * 5  							the single number
 * 
 * This happens because XOR returns a 1 if the 0 and the 1 bits
 * place are different (one zero, one one).  If a XOR is used on
 * a number and itself, they will match up exactly in bits, so
 * the XOR will always be 0.
 * -------------------------------------------------------------
 */