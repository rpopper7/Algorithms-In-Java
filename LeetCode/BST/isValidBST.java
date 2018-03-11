/* ------------------------------------------------------------- 
 * 98.  Validate Binary Search Tree
 * -------------------------------------------------------------
 * Given a binary tree, determine if it is a valid binary search
 * tree (BST).  
 *
 * Assume a BST is defined as follows:
 * 	- The left subtree of a node contains only nodes with keys
 *    less than the node's key.
 *  - The ight subtree of a node contains only nodes with keys
 *    greater than the node's key.
 *  - Both the left and right subtrees must also be binary search
 *    trees.
 * -------------------------------------------------------------
 */

public class Solution
{
	/**
	* Definition for a binary tree node
	* public class TreeNode {
	* 	int val;
	*   TreeNode left;
	*   TreeNode right;
	*   TreeNode (int x) { val = x; }
	*/

	public boolean isValidBST(TreeNode root)
	{

	}

	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> myList = new ArrayList<>(); // store values to return as a list
		Stack<TreeNode> stack = new Stack<>();	// Use a stack for DFS

		// Edge case
		if (root == null) return myList;
		
		while (root != null || !stack.empty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			myList.add(root.val);
			root = root.right;
		}

		return myList;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * First, set up an iterative BST function.  Use a stack for
 * DFS.  T
 * -------------------------------------------------------------
 */