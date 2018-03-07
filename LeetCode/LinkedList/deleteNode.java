/* ------------------------------------------------------------- 
 * 237.  Delete Node in a Linked List
 * -------------------------------------------------------------
 * Write a function to delete a node (except the tail) in a 
 * singly linked list, given ONLY access to that node.
 *
 * Suppose the linked list is 1 -> 2 -> 3 -> 4 and you are given
 * the third node with value 3, the linked list should become
 * 1 -> 2 -> 4 after calling your function.
 * -------------------------------------------------------------
 */

public class Solution
{
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * 		int val;
	 * 		ListNode next;
	 * 		ListNode(int x) { val = x; }
	 * }
	 */

	public void deleteNode(ListNode node)
	{
		// Copy the next node into the node to delete
		node.val = node.next.val;

		// Delete the next node
		node.next = node.next.next;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * There is only access to the node given, so the traditional
 * delete method of linking the one previous to it to the one 
 * after it doesn't work, because there is no access to the previous
 * node from the current node.
 * 
 * Because of this, it works to copy the next node into the node
 * to delete, and then delete the next node instead.
 * -------------------------------------------------------------
 */