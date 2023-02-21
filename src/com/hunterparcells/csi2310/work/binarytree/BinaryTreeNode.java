package com.hunterparcells.csi2310.work.binarytree;

import com.hunterparcells.csi2310.util.Logger;

public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Inserts a value into the tree.
     * <p>
     * Values less than or equal to will be inserted to the left, values greater than will be inserted to the right.
     *
     * @param value The value to insert.
     */
    public void insert(int value) {
        if(value <= this.value) {
            if(this.left == null) {
                this.left = new BinaryTreeNode(value);
            }else {
                this.left.insert(value);
            }
        }else {
            if(this.right == null) {
                this.right = new BinaryTreeNode(value);
            }else {
                this.right.insert(value);
            }
        }
    }

    /**
     * Walks the tree in order.
     */
    public void walk() {
        if(this.left != null) {
            this.left.walk();
        }
        Logger.log(this.value + " ", false);
        if(this.right != null) {
            this.right.walk();
        }
    }
}
