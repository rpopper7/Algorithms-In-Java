/* ------------------------------------------------------------- 
 * 104.  Maximum Depth of Binary Tree
 * -------------------------------------------------------------
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest
 * path from the root node down to the farthest leaf node.
 * 
 * FOR EXAMPLE:
 * 		Given binary tree [3, 9, 20, null, null, 15, 7],
 * 		return its depth = 3.
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

	public int maxDepth(TreeNode root)
	{
		// BASE CASE
		if (root == null) return 0; 

		// RECURSIVE CASE
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * Recursively search for which tree has the higher max depth,
 * if the root is null, then that is the base case and return 0.
 * Add 1 each time the recursion hits a new level of the tree.
 * -------------------------------------------------------------
 */