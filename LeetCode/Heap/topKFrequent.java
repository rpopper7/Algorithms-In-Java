/* ------------------------------------------------------------- 
 * 692.  Top K Frequent Words
 * -------------------------------------------------------------
 * Given a non-empty list of words, return the k most frequent
 * elements.
 * 
 * Your answer should be sorted by frequency from highest to
 * lowest.  If two words have the same frequency, then the word
 * with the lower alphabetical order comes first.
 *
 * NOTE:  
 * 		1. You may assume k is always valid 1<=k<= num of unique elements
 * 		2.  Input words contain only lowercase letters
 * 
 * FOLLOW UP: 
 * 		1.  Try to solve it in O(n log k) time and O(n) extra space.
 * -------------------------------------------------------------
 */

public class Solution
{
	public List<String> topKFrequent(String[] words, int k)
	{
		// Use a hashmap to track the frequency
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		for (String word : words)
		{
			myMap.put(word, myMap.getOrDefault(word, 0) + 1);
		}

		// Implement a maxHeap using Priority Queue data structure
		// Edit Comparators for the maxHeap to comply with instructions
		PriorityQueue<HashMap.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
			(a, b) -> a.getValue() == b.getValue()
			? a.getKey().compareTo(b.getKey())
			: b.getValue() - a.getValue()
		);

		// Add to the maxHeap
		for (HashMap.Entry<String, Integer> entry : myMap.entrySet())
		{
			maxHeap.add(entry);
		}

		// Holds answer
		List<String> answer = new ArrayList<String>();

		// Pop the top k keys off of maxHeap
		while (answer.size() < k)
		{
			answer.add(maxHeap.poll().getKey()); 
		}

		return answer;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * The hashmap keeps track of the frequency of elements
 * Then this information is put into a maxHeap.  To create a max
 * heap in Java, if the comparators are not equal, one is 
 * subtracted from the other.  If they are equal, the keys
 * are evaluated alphabetically because that is what the problem's
 * instructions specify.  
 * -------------------------------------------------------------
 */