package com.hunterparcells.csi2310.work.project1;

public class IntNode {
    private int sequenceNumber;
    private int data;
    private IntNode link;

    // Precondition:
    // Postcondition: All instance variables of the IntNode class are initialized in order.
    public IntNode(int initialSequenceNumber, int initialData, IntNode initialLink) {
        sequenceNumber = initialSequenceNumber;
        data = initialData;
        link = initialLink;
    }


    // Precondition: This instance of the IntNode class exists.
    // In other words, the object whose method is activated exists as a node in the linked list.
    // Postcondition: A new node with attributes item and data is created. Item serves as sequenceNumber.
    // The new node is added to the linked list at a position that comes immediately after the node whose method is activated.
    public void addNodeAfter(int item, int data) {
        IntNode newNode = new IntNode(item, data, this.link);
        this.link = newNode;
    }


    // Precondition: This instance of the IntNode class exists.
    // In other words, the object whose method is activated exists as a node in the linked list.
    // Postcondition: The specific node, which comes immediately after the node whose method is activated,
    // is removed from the linked list.
    public void removeNodeAfter() {
        IntNode link = this.link;
        this.link = link.link;
        link.link = null;
    }


    // Precondition: This instance of the IntNode class exists.
    // Postcondition: The sequenceNumber of this node is returned.
    public int getsequenceNumber() {
        return this.sequenceNumber;
    }


    // Precondition: This instance of the IntNode class exists.
    // Postcondition: The link of this node is returned.
    public IntNode getLink() {
        return this.link;
    }


    // Precondition: The linked list contains at least one element.
    // Postcondition: The (sequence number, data) pairs of each node in the linked list, starting with the head,
    // are displayed on the monitor.
    public void displayNodeData(IntNode head) {
        System.out.print("The (sequence number, data) pairs in the linked list are:");
        while(head != null) {
            System.out.printf(" (%d,%d)", head.sequenceNumber, head.data);
            head = head.link;
        }
        System.out.println();
    }


    // Precondition: The head of the linked list is different than null, and its sequenceNumber is different than target.
    // Postcondition: The link to the specific node, which comes before the node whose sequenceNumber is equal to target,
    // is returned. If the linked list does not contain a node with sequenceNumber equal to target, then null is returned.
    public IntNode findPrevious(IntNode head, int target) {
        // Implement me.
        while(head != null) {
            if(head.link != null && head.link.sequenceNumber == target) {
                return head;
            }

            head = head.link;
        }

        return null;
    }


    // Precondition: The head of the linked list is different than null, and its sequenceNumber is smaller than target.
    // Postcondition: The link to the specific node, which comes before the node that is the first in the linked list
    // to have a sequenceNumber greater than target, is returned.
    // If no such node is found, the link to the last node in the linked list is returned.
    public IntNode locatePredecessor(IntNode head, int target) {
        // Implement me.
        while(head.link != null) {
            if(head.link.sequenceNumber > target) {
                return head.link;
            }
            head = head.link;
        }

        return head;
    }

}