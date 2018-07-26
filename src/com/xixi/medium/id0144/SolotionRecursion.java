package com.xixi.medium.id0144;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**  
*  144. Binary Tree Preorder Traversal 
*  link：https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
*  
*  idea：
*  
*  first traverse left tree, if node is null, traverse right tree;
*  
*  
*  
* @author VincentMLiu 

* @date 2018年7月26日  

*/  



class TreeNode {
	TreeNode parent;
	boolean isRecorded = false;
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> preorderList = new ArrayList<Integer>();
		if (root == null) {

		} else {
			this.goToNextTreeNode(root, preorderList, 3);
		}

		return preorderList;
	}

	public void goToNextTreeNode(TreeNode node, List<Integer> preorderList, int direction) {
		TreeNode nowNode;

		if (node == null) { // root node
			return;
		}

		if (node.isRecorded == false) { // write to preorderList
			preorderList.add(node.val);
			node.isRecorded = true;
		}
		if (node.left != null) {// if have left node,goes down to left.
			nowNode = node.left;
			nowNode.parent = node;
			this.goToNextTreeNode(nowNode, preorderList, 1);
		} else if (node.right != null) {// if don't have left, then goes down to right.
			nowNode = node.right;
			nowNode.parent = node;
			this.goToNextTreeNode(nowNode, preorderList, 2);
		} else {// if reach the end, goes back.
			nowNode = node.parent;
			// remove the end node.
			switch (direction) {
			case 1: //case 1, this is a left node.
				nowNode.left = null;
				break;
			case 2: //case 1, this is a left node.
				nowNode.right = null;
				break;
			default:
				break;
			}
			this.goToNextTreeNode(nowNode, preorderList, 3); //other number means other direction.
		}

	}

}



public class SolotionRecursion {
	public static TreeNode stringToTreeNode(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return null;
		}

		String[] parts = input.split(",");
		String item = parts[0];
		TreeNode root = new TreeNode(Integer.parseInt(item));
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);

		int index = 1;
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int leftNumber = Integer.parseInt(item);
				node.left = new TreeNode(leftNumber);
				nodeQueue.add(node.left);
			}

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int rightNumber = Integer.parseInt(item);
				node.right = new TreeNode(rightNumber);
				nodeQueue.add(node.right);
			}
		}
		return root;
	}

	public static String integerArrayListToString(List<Integer> nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for (int index = 0; index < length; index++) {
			Integer number = nums.get(index);
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayListToString(List<Integer> nums) {
		return integerArrayListToString(nums, nums.size());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			TreeNode root = stringToTreeNode(line);

			List<Integer> ret = new Solution().preorderTraversal(root);

			String out = integerArrayListToString(ret);

			System.out.print(out);
		}
	}
}

