/* ------------------------------------------------------------- 
 * 141.  Linked List Cycle
 * -------------------------------------------------------------
 * Given a Linked List, determine if it has a cycle in it.
 *
 * FOLLOW UP:  Can you solve it without using extra space?
 * -------------------------------------------------------------
 */

public class Solution
{
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * 		int val;
	 * 		ListNode next;
	 * 		ListNode(int x) { 
	 *          val = x;
	 *          next = null;
	 *      }
	 * }
	 */

	public boolean hasCycle(ListNode head)
	{
		// Edge Case
		if (head == null) return false;

		ListNode slowNode = head;
		ListNode fastNode = head;

		while (fastNode.next != null && fastNode.next.next != null)
		{
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;

			if (slowNode == fastNode) return true;
		}

		return false;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * Two nodes go through the list, one going 2 steps at a time and
 * one going one step at a time.  If the linked list is not
 * cyclic, the while loop will end and it will return false.  If
 * the linked list is cyclic, the faster node will meet the slower
 * node at some point and return true.
 * -------------------------------------------------------------
 */