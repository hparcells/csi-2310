package com.hunterparcells.csi2310.work.project4;

public class TreeNode {

    private String computerName;

    private int[] malwareAnalyses; // This instance variable belongs to detector work that lies outside the scope of the project.

    private TreeNode parent;

    private TreeNode leftChild;

    private TreeNode rightChild;


    // Precondition: None.
    // Postcondition: A new node is created for a computer in the large enterprise network,
    //                and its instance variables are initialized.
    //
    public TreeNode(String computerNameValue, TreeNode parentValue, TreeNode leftChildValue, TreeNode rightChildValue) {
        // Implement me.
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: newNode is inserted in the binary search tree.
    //                The revised tree satisfies the binary search tree property.
    //
    public void insertNewNode(TreeNode currentNode, TreeNode newNode) {
        // Implement me.

    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: The tree is walked in order to display the keys of its nodes.
    //                The walk starts at currentNode.
    //
    public TreeNode analyzeInOrder(TreeNode currentNode) {
        // Implement me.
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: The tree is walked in pre-order to display the keys of its nodes.
    //                The walk starts at currentNode.
    //
    public TreeNode analyzeInPreOrder(TreeNode currentNode) {
        // Implement me.
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: The tree is walked in post-order to display the keys of its nodes.
    //                The walk starts at currentNode.
    //
    public TreeNode analyzeInPostOrder(TreeNode currentNode) {
        // Implement me.
    }
}
