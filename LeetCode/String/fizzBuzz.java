/* ------------------------------------------------------------- 
 * 412.  FizzBuzz
 * -------------------------------------------------------------
 * Write a program that outputs the string representation of
 * numbers from 1 to n.
 *
 * But for multiples of three it should output "Fizz" instead of
 * the number and for multiples of five output "Buzz".  For 
 * numbers which are multiples of both three and five output
 * "FizzBuzz".
 * -------------------------------------------------------------
 */

public class Solution
{
	public List<String> fizzBuzz(int n)
	{
		List<String> myList = new ArrayList<String>();

		for (int i = 1; i <= n; i++)
		{
			if (i % 15 == 0) 		myList.add("FizzBuzz");
			else if (i % 3 == 0)	myList.add("Fizz");
			else if (i % 5 == 0) 	myList.add("Buzz");
			else 					myList.add(String.valueOf(i));
		}
		
		return myList;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * For loop starts at 1 and goes until it's equal to n.  This is 
 * because this uses the counting numbers starting at 1.  If
 * i % 15 == 0, the number is a multiple of both 3 and 5, so it
 * adds "FizzBuzz" to the ArrayList.
 * -------------------------------------------------------------
 */