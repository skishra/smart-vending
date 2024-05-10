package com.skrahaman;

public class TreeNode {
    public Snack snack;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Snack snack) {
        this.snack = snack;
    }

    @Override
    public String toString() {
        return snack.toString();
    }
}
