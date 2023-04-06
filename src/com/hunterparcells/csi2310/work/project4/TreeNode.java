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
        this.computerName = computerNameValue;
        this.parent = parentValue;
        this.leftChild = leftChildValue;
        this.rightChild = rightChildValue;
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: newNode is inserted in the binary search tree.
    //                The revised tree satisfies the binary search tree property.
    //
    public void insertNewNode(TreeNode currentNode, TreeNode newNode) {
        if(newNode.computerName.compareTo(currentNode.computerName) < 0) {
            if(currentNode.leftChild == null) {
                currentNode.leftChild = newNode;
                newNode.parent = currentNode;
            }else {
                this.insertNewNode(currentNode.leftChild, newNode);
            }
        }else {
            if(currentNode.rightChild == null) {
                currentNode.rightChild = newNode;
                newNode.parent = currentNode;
            }else {
                this.insertNewNode(currentNode.rightChild, newNode);
            }
        }
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: The tree is walked in order to display the keys of its nodes.
    //                The walk starts at currentNode.
    //
    public TreeNode analyzeInOrder(TreeNode currentNode) {
        if(currentNode.leftChild != null) {
            this.analyzeInOrder(currentNode.leftChild);
        }

        System.out.println(currentNode.computerName);

        if(currentNode.rightChild != null) {
            this.analyzeInOrder(currentNode.rightChild);
        }

        return currentNode;
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: The tree is walked in pre-order to display the keys of its nodes.
    //                The walk starts at currentNode.
    //
    public TreeNode analyzeInPreOrder(TreeNode currentNode) {
        System.out.println(currentNode.computerName);

        if(currentNode.leftChild != null) {
            this.analyzeInPreOrder(currentNode.leftChild);
        }

        if(currentNode.rightChild != null) {
            this.analyzeInPreOrder(currentNode.rightChild);
        }

        return currentNode;
    }


    // Precondition: currentNode is an existent node in the binary search tree.
    // Postcondition: The tree is walked in post-order to display the keys of its nodes.
    //                The walk starts at currentNode.
    //
    public TreeNode analyzeInPostOrder(TreeNode currentNode) {
        if(currentNode.leftChild != null) {
            this.analyzeInPostOrder(currentNode.leftChild);
        }

        if(currentNode.rightChild != null) {
            this.analyzeInPostOrder(currentNode.rightChild);
        }

        System.out.println(currentNode.computerName);

        return currentNode;
    }
}
