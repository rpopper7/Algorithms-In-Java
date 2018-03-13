/* ------------------------------------------------------------- 
 * 160.  Intersection of Two Linked Lists
 * -------------------------------------------------------------
 * Write a program to find the node at which the intersection of
 * two singly linked lists begins.
 *
 * NOTES: 
 * 	- If the two linked lists have no intersection return null
 * 	- The linked lists must retain their original structure after
 *    the function returns.
 * 	- You may assume there are no cycles anywhere in the entire
 * 	  linked list structure
 * 	- Your code should preferably run in O(n) time and O(1) memory
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
	 *			val = x; 
	 *			next = null;
	 *      }
	 * }
	 */

	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		// Edge Cases
		if(headA == null || headB == null) return null;

		ListNode currentA = headA;
		ListNode currentB = headB;

		while (currentA != currentB)
		{
			if (currentA == null) currentA = headB;
			else currentA = currentA.next;

			if (currentB == null) currentB = headA;
			else currentB = currentB.next;
		}

		return currentA;
	}

	public ListNode getIntersectionNodeV2(ListNode headA, ListNode headb)
	{
		int lengthA = length(headA), lengthB = length(headB);
	}
	private int length(ListNode node)
	{
		int length = 0; 
		while (node != null)
		{
			node = node.next;
			length++;
		}
		return length;
	}
}

// A B C 
//          D E F G 
// Z Y B D

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * Go through both lists together at once.  If one list reaches
 * the end, continue scanning the other list.   Once the two
 * runners find each other, return the position.
 * -------------------------------------------------------------
 */