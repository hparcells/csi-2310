package com.hunterparcells.csi2310.work.tree;

public class TreeNode {
    private TreeNode parent, leftChild, rightChild;
    private String playerName;

    public TreeNode(String playerName, TreeNode parent, TreeNode leftChild, TreeNode rightChild) {
        this.playerName = playerName;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Searches the tree for a node with the given name.
     *
     * @param root The root of the tree to search.
     * @param name The name of the node to search for.
     *
     * @return The node with the given name, or null if it does not exist.
     */
    public static TreeNode searchNode(TreeNode root, String name) {
        if(root.playerName.equals(name)) {
            return root;
        }else if(root.leftChild != null && root.playerName.compareTo(name) > 0) {
            return TreeNode.searchNode(root.leftChild, name);
        }else if(root.rightChild != null && root.playerName.compareTo(name) < 0) {
            return TreeNode.searchNode(root.rightChild, name);
        }else {
            return null;
        }
    }

    /**
     * Inserts a node into the tree.
     *
     * @param name The name of the node to insert.
     */
    public void insertNode(String name) {
        if(this.playerName.compareTo(name) > 0) {
            if(this.leftChild == null) {
                this.leftChild = new TreeNode(name, this, null, null);
            }else {
                this.leftChild.insertNode(name);
            }
        }else if(this.playerName.compareTo(name) < 0) {
            if(this.rightChild == null) {
                this.rightChild = new TreeNode(name, this, null, null);
            }else {
                this.rightChild.insertNode(name);
            }
        }
    }

    /**
     * Find the node whose key is the minimum.
     *
     * @param node The node to start from.
     *
     * @return The left-most node.
     */
    public TreeNode treeMinimum(TreeNode node) {
        while(node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    public TreeNode transplant(TreeNode node, TreeNode replaced, TreeNode branch) {
        if(replaced.parent == null) {
            node = branch;
        }else if(replaced == replaced.parent.leftChild) {
            replaced.parent.leftChild = branch;
        }else {
            replaced.parent.rightChild = branch;
        }
        if(branch != null) {
            branch.parent = replaced.parent;
        }

        return node;
    }

    public TreeNode treeDelete(TreeNode root, TreeNode z) {
        TreeNode revisedTree, y = null;

        if(z.leftChild == null) {
            revisedTree = transplant(root, z, z.rightChild);
        }else if(z.rightChild == null) {
            revisedTree = transplant(root, z, z.leftChild);
        }else {
            y = treeMinimum(z.rightChild);
            if(y.parent != z) {
                revisedTree = transplant(root, y, y.rightChild);
                y.rightChild = z.rightChild;
                y.rightChild.parent = y;
            }
            revisedTree = transplant(root, z, y);
            y.leftChild = z.leftChild;
            y.leftChild.parent = y;
        }
        return root;
    }

    /**
     * Produces a flattened string of the tree from the called node.
     *
     * @return A string representation of the tree from the called node.
     */
    public String branchToString() {
        String branch = "";
        if(this.leftChild != null) {
            branch += this.leftChild.branchToString();
        }
        branch += this.playerName + " ";
        if(this.rightChild != null) {
            branch += this.rightChild.branchToString();
        }
        return branch;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
