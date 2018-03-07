/* ------------------------------------------------------------- 
 * 344. Reverse String
 * -------------------------------------------------------------
 * Write a function that takes a string as input and returns the
 * the string reversed.
 * 
 * EXAMPLE: Given s = "hello", return "olleh".
 * -------------------------------------------------------------
 */

public class Solution
{
	public String reverseString(String s)
	{
		StringBuilder builder = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--)
		{
			builder.append(s.charAt(i));
		}

		return builder.toString();
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * Input String is iterated through backwards, and each 
 * character is added to a StringBuilder.
 * -------------------------------------------------------------
 */