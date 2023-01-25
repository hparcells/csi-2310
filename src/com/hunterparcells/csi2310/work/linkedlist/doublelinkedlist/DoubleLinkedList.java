package com.hunterparcells.csi2310.work.linkedlist.doublelinkedlist;

public class DoubleLinkedList {
    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

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
    }

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
    }

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

    public void removeNth(int n) {
        this.getNth(n).remove();
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        DoubleLinkedListNode currentNode = this.head;
        while(currentNode != null) {
            output.append(currentNode.getValue()).append(" ");
            currentNode = currentNode.getNext();
        }

        return output.toString();
    }

    public DoubleLinkedListNode getHead() {
        return head;
    }

    public void setHead(DoubleLinkedListNode head) {
        this.head = head;
    }

    public DoubleLinkedListNode getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedListNode tail) {
        this.tail = tail;
    }
}
