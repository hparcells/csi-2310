package com.hunterparcells.csi2310.work.linkedlist;

import com.hunterparcells.csi2310.util.Logger;

/**
 * A linked list data structure.
 */
public class IntDoubleLinkedList {
    private static final boolean DEBUG_MODE = true;

    private IntNode head;
    private IntNode tail;

    public IntDoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Adds a value to the start of the list.
     *
     * @param value The value to add.
     */
    public void unshift(int value) {
        IntNode newNode;
        if(this.head == null) {
            newNode = new IntNode(value, null, null);

            this.tail = newNode;
        }else {
            newNode = new IntNode(value, this.head, null);
            this.head.setPrevious(newNode);
        }
        this.head = newNode;

        if(DEBUG_MODE) {
            Logger.log("Adding " + value + " to the start of the list.\n");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Removes the first node from the list.
     */
    public void shift() {
        this.head = this.head.getNext();
        this.head.setPrevious(null);
    }

    /**
     * Adds a value to the end of the list.
     *
     * @param value The value to add.
     */
    public void push(int value) {
        IntNode newNode;

        if(this.head == null) {
            newNode = new IntNode(value, null, null);

            this.head = newNode;
        }else {
            newNode = new IntNode(value, null, this.tail);
            this.tail.setNext(newNode);
        }
        this.tail = newNode;

        if(DEBUG_MODE) {
            Logger.log("Adding " + value + " to the end of the list.");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Removes the last node from the list.
     */
    public void pop() {
        this.tail = this.tail.getPrevious();
        this.tail.setNext(null);
    }

    /**
     * Gets the nth value of the list (not the index).
     *
     * @param n The nth node to get.
     *
     * @return The value of the nth node.
     */
    public IntNode getNth(int n) {
        IntNode currentNode = this.head;
        int counter = 0;
        while(currentNode != null) {
            if(counter == (n - 1)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
            counter++;
        }
        return null;
    }

    /**
     * Gets the node at the specified index.
     *
     * @param index The index to get.
     *
     * @return The value of the node at the index.
     */
    public IntNode getIndex(int index) {
        IntNode currentNode = this.head;
        int counter = 0;
        while(currentNode != null) {
            if(counter == index) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
            counter++;
        }
        return null;
    }

    /**
     * Removes the nth node from the list.
     *
     * @param n The nth node to remove.
     */
    public void removeNth(int n) {
        this.getNth(n).remove();

        if(DEBUG_MODE) {
            Logger.log("Removing the " + n + "th node from the list.");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Removes nodes by index.
     *
     * @param index The index to remove.
     */
    public void removeIndex(int index) {
        this.getIndex(index).remove();

        if(DEBUG_MODE) {
            Logger.log("Removing the node at index " + index + " from the list.");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Returns the total size of the list.
     *
     * @return The size of the list in node count.
     */
    public int size() {
        IntNode currentNode = this.head;
        int counter = 0;
        while(currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }

    /**
     * Inserts a node at a specified index.
     *
     * @param value The value of the node.
     * @param index The index to insert the node at.
     */
    public void insertAtIndex(int value, int index) {
        if(index == 0) {
            this.unshift(value);
            return;
        }
        if(index == this.size()) {
            this.push(value);
            return;
        }

        IntNode newNode = new IntNode(value, this.getIndex(index), this.getIndex(index - 1));
        this.getIndex(index - 1).setNext(newNode);
        // Okay, the list shifted, so we need to +1;
        this.getIndex(index + 1).setPrevious(newNode);

        if(DEBUG_MODE) {
            Logger.log("Inserting " + value + " at index " + index + " in the list.");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Inserts a node at a specified nth index.
     *
     * @param value The value to insert.
     * @param n     The nth index to insert at.
     */
    public void insertAtNth(int value, int n) {
        this.insertAtIndex(value, n - 1);

        if(DEBUG_MODE) {
            Logger.log("Inserting " + value + " at the " + n + "th index in the list.");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Reverses the list.
     */
    public void reverse() {
        IntNode currentNode = this.head;
        IntNode tempNode;

        // Reverse all the nodes directions.
        while(currentNode != null) {
            tempNode = currentNode.getNext();
            currentNode.setNext(currentNode.getPrevious());
            currentNode.setPrevious(tempNode);
            currentNode = tempNode;
        }

        // Swap the head and tail node to link them all.
        tempNode = this.head;
        this.head = this.tail;
        this.tail = tempNode;

        if(DEBUG_MODE) {
            Logger.log("Reversing the list.");
            Logger.log(this + "\n\n");
        }
    }

    public IntNode search(int value) {
        IntNode currentNode = this.head;

        while(currentNode != null && currentNode.getValue() == value) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /**
     * Returns the list as a space-diliminated string.
     *
     * @return The list.
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        IntNode currentNode = this.head;
        while(currentNode != null) {
            output.append(currentNode.getValue()).append(" ");
            currentNode = currentNode.getNext();
        }
        return output.toString();
    }

    /**
     * Gets the head/first node.
     *
     * @return The value of the node.
     */
    public IntNode getHead() {
        return this.head;
    }

    /**
     * Sets the head/first node.
     *
     * @param head The new value of the node.
     */
    public void setHead(IntNode head) {
        this.head = head;
    }

    /**
     * Gets the tail/last node.
     *
     * @return The value of the node.
     */
    public IntNode getTail() {
        return this.tail;
    }

    /**
     * Sets the tail/last node.
     *
     * @param tail The new value of the node.
     */
    public void setTail(IntNode tail) {
        this.tail = tail;
    }
}
