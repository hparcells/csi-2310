package com.hunterparcells.csi2310.work.linkedlist;

import com.hunterparcells.csi2310.util.Logger;
import com.hunterparcells.csi2310.work.linkedlist.doublelinkedlist.DoubleLinkedListNode;

/**
 * A linked list data structure.
 */
public class IntLinkedList {
    private static final boolean DEBUG_MODE = true;

    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;

    public IntLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Adds a value to the start of the list.
     *
     * @param value The value to add.
     */
    public void addToStart(int value) {
        DoubleLinkedListNode newNode;
        if(this.head == null) {
            newNode = new DoubleLinkedListNode(value, null, null);

            this.tail = newNode;
        }else {
            newNode = new DoubleLinkedListNode(value, this.head, null);
            this.head.setPrevious(newNode);
        }
        this.head = newNode;

        if(DEBUG_MODE) {
            Logger.log("Adding " + value + " to the start of the list.\n");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Adds a value to the end of the list.
     *
     * @param value The value to add.
     */
    public void addToEnd(int value) {
        DoubleLinkedListNode newNode;

        if(this.head == null) {
            newNode = new DoubleLinkedListNode(value, null, null);

            this.head = newNode;
        }else {
            newNode = new DoubleLinkedListNode(value, null, this.tail);
            this.tail.setNext(newNode);
        }
        this.tail = newNode;

        if(DEBUG_MODE) {
            Logger.log("Adding " + value + " to the end of the list.");
            Logger.log(this + "\n\n");
        }
    }

    /**
     * Gets the nth value of the list (not the index).
     *
     * @param n The nth node to get.
     *
     * @return The value of the nth node.
     */
    public DoubleLinkedListNode getNth(int n) {
        DoubleLinkedListNode currentNode = this.head;
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
    public DoubleLinkedListNode getIndex(int index) {
        DoubleLinkedListNode currentNode = this.head;
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
        DoubleLinkedListNode currentNode = this.head;
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
            this.addToStart(value);
            return;
        }
        if(index == this.size()) {
            this.addToEnd(value);
            return;
        }

        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value, this.getIndex(index), this.getIndex(index - 1));
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
        DoubleLinkedListNode currentNode = this.head;
        DoubleLinkedListNode tempNode;

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

    /**
     * Returns the list as a space-diliminated string.
     *
     * @return The list.
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        DoubleLinkedListNode currentNode = this.head;
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
    public DoubleLinkedListNode getHead() {
        return this.head;
    }

    /**
     * Sets the head/first node.
     *
     * @param head The new value of the node.
     */
    public void setHead(DoubleLinkedListNode head) {
        this.head = head;
    }

    /**
     * Gets the tail/last node.
     *
     * @return The value of the node.
     */
    public DoubleLinkedListNode getTail() {
        return this.tail;
    }

    /**
     * Sets the tail/last node.
     *
     * @param tail The new value of the node.
     */
    public void setTail(DoubleLinkedListNode tail) {
        this.tail = tail;
    }
}
