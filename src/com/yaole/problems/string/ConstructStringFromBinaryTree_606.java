package com.yaole.problems.string;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class ConstructStringFromBinaryTree_606 {
    public static String tree2str(TreeNode t) {
        if (t == null) return "";
        if (t.left == null && t.right == null) return String.valueOf(t.val);
        if (t.left == null) return String.valueOf(t.val) + "()" + "(" + tree2str(t.right) + ")";
        if (t.right == null) return String.valueOf(t.val) + "(" + tree2str(t.left) + ")";
        return String.valueOf(t.val) + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }

    public static void main(String[] args) {

    }
}