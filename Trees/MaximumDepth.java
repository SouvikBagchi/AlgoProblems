import java.util.LinkedList;
import java.util.Queue;


/*
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.


 */

/*
 * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class MaximumDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root) {
		
		//If we reach a null node then we return 0
		if(root == null) return 0;
		
		//Else we recurse through the entire tree to find left and right height and take the max of it
		//We add plus one since we are back tracking and with each call we move up a level
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));

	}

}


