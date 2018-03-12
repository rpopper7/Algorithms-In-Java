/* ------------------------------------------------------------- 
 * 101.  Symmetric Tree
 * -------------------------------------------------------------
 * Given a binary tree, check whether it is a mirror of itself
 * (i.e. symmetric around its center)
 *
 * NOTE: Bonus points if you could solve it both recursively and
 * iteratively.
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

	// RECURSIVE SOLUTION
	public boolean isSymmetric(TreeNode root)
	{
		if (root == null) return true;
		return isSymmetricRecursive(root.left, root.right);
	}
	public boolean isSymmetricRecursive(TreeNode left, TreeNode right)
	{
		if (left == null && right == null) return true;
		if (left == null || right == null || left.val != right.val) return false;

		return isSymmetricRecursive(left.left, right.right) && isSymmetric (right.left, left.right);
	}

	// ITERATIVE SOLUTION
	public boolean isSymmetricIterative(TreeNode root)
	{
		if (root == null) return true;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root.left);
		stack.push(root.right);

		while(!stack.empty())
		{
			TreeNode node1 = stack.pop(), node2 = stack.pop();
			if (node1 == null && node2 == null) continue;
			if (node1 == null || node2 == null || node1.val != node2.val) return false;
			stack.push(node1.left);
			stack.push(node2.right);
			stack.push(node1.right);
			stack.push(node2.left);
		}

		return true;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * Recursive solution:  Check if both nodes are null.  If they are,
 * return true, as you have found the answer or the tree doesn't exist.
 * Otherwise, check if one is null without the other or if the values aren't
 * equal.  In such a case, return false.  Then recursively check
 * nodes in pairs.
 *
 * Iterative solution:  Remember, stacks can hold null value nodes.
 * Create a stack and push onto it the left and right nodes of the root.
 * While the stack is not empty, pop off the stack the top 2 nodes and
 * check if they are the same or different.  Then push on these pairs:
 * left.left with right.right
 * left.right with right.left
 * in order to check if they are mirrored.  Return true if all of this
 * while loop completes.
 * -------------------------------------------------------------
 */