package com.skrahaman;

public class TreeNode {
    public Snack data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Snack data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
