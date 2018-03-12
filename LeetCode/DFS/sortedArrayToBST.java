/* ------------------------------------------------------------- 
 * 108.  Convert Sorted Array to Binary Search Tree
 * -------------------------------------------------------------
 * Given an array where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * 
 * For this problem, a height balanced BST is defined as a BST
 * in which the depth of the two subtrees of every node never 
 * differ by more than 1.
 * -------------------------------------------------------------
 */

public class Solution
{
	/*  Definition for a binary tree node.
	*	public class TreeNode {
	*	int val;
	* 	TreeNode left;
	* 	TreeNode right;
	* 	TreeNode(int x) { val = x; }
	* }
	*/

	public TreeNode sortedArrayToBST(int[] nums)
	{
		// Edge case
		if(nums.length == 0 || nums == null) return null;

		TreeNode head = constructTree(nums, 0, nums.length - 1);

		return head;
	}

	public TreeNode constructTree(int[] nums, int start, int end)
	{
		if (start > end) // done
		{
			return null;
		}

		// Use Pre-order traversal to construct a tree
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(num[mid]);
		node.left = constructTree(nums, low, mid - 1);
		node.right = constructTree(nums, mid + 1, high);
		return node;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * Recursive solution using Pre-Order traversal to build the tree.
 * Time complexity O(n).  The middle is used to bound the array
 * and to prevent overflows.
 * -------------------------------------------------------------
 */