package com.hunterparcells.csi2310.work.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToStart(int value) {
        Node newNode;

        if(this.head == null) {
            newNode = new Node(value, null, null);

            this.tail = newNode;
        }else {
            newNode = new Node(value, this.head, null);
            this.head.setPrevious(newNode);
        }
        this.head = newNode;
    }

    public void addToEnd(int value) {
        Node newNode;

        if(this.head == null) {
            newNode = new Node(value, null, null);

            this.head = newNode;
        }else {
            newNode = new Node(value, null, this.tail);
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
    }

    public Node getNth(int n) {
        Node currentNode = this.head;
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

        Node currentNode = this.head;
        while(currentNode != null) {
            output.append(currentNode.getValue()).append(" ");
            currentNode = currentNode.getNext();
        }

        return output.toString();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
