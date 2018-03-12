/* ------------------------------------------------------------- 
 * 450.  Delete Node in a BST
 * -------------------------------------------------------------
 * Given a root node reference of a BST and a key, delete the
 * node witht he given key in the BST.  Return the root node
 * reference (possibly updated) of the BST.
 *
 * Basically, the deletion can be divided into two stages:
 * 		1.  Search for a node to remove
 * 		2.  If the node is found, delete the node
 *
 * NOTE: Time complexity should be O(height of tree).
 * -------------------------------------------------------------
 */

public class Solution
{
	/* Definition for a binary tree node.
	 * public class TreeNode {
	 *		int val;
	 * 		TreeNode left;
	 * 		TreeNode right;
	 * 		TreeNode(int x) { val = x; }
	 * }
	 */

	// Recursive Solution
	public TreeNode deleteNode(TreeNode root, int key)
	{
		if (root == null) return root;	// didn't find node / tree is empty

		// Travel down the tree, searching
		if (root.val > key) root.left = deleteNode(root.left, key);	// search
		else if (root.val < key) root.right = deleteNode(root.right, key); //search
		
		else	// found node to be deleted in the tree
		{
			// Node has 1 child or NO children
			if (root.left == null) return root.right;
			else if (root.right == null) return root.left;

			// Node has TWO children, replace with InOrder Successor (minimum val)
			// in the Right subtree
			root.val = getMin(root.right);
			// Recursively delete the next successor
			root.right = deleteNode(root.right, root.val);
		}

		return root;
	} // find minimum value in subtree
	private int getMin(TreeNode root)
	{
		while(root.left != null) 
		{
			root = root.left;
		}
		return root.val;
	}
}

/* -------------------------------------------------------------
 * SOLUTION
 * -------------------------------------------------------------
 * If the node to be deleted is a leaf, simply
 * remove it from the tree.  If the node to be deleted has only
 * one child, copy the child to the node and delete the child.
 * If the node to be deleted has two children, find the inorder 
 * successor of the node.  Copy contents of the inorder successor
 * to the node and delete the inorder successor.
 * -------------------------------------------------------------
 */