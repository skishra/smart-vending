package com.skrahaman;

public class VendingMachine {
    public TreeNode root;

    public VendingMachine() {
        root = new TreeNode(new Snack("Snack", true, false));
        TreeNode foodNode = new TreeNode(new Snack("Food", true, false));
        TreeNode drinkNode = new TreeNode(new Snack("Drink", false, false));
        root.left = foodNode;
        root.right = drinkNode;

        foodNode.left = new TreeNode(new Snack("Sweet", true, false));
        foodNode.right = new TreeNode(new Snack("Savory", true, false));

        drinkNode.left = new TreeNode(new Snack("Natural", false, false));
        drinkNode.right = new TreeNode(new Snack("Artificial", false, false));

        foodNode.left.left = new TreeNode(new Food("Chocolate", true, true));
        foodNode.right.left = new TreeNode(new Food("Potato Chips", false, true));
        drinkNode.left.left = new TreeNode(new Drink("Orange Juice", true, true));
        drinkNode.right.left = new TreeNode(new Drink("Soda", false, true));
    }
}