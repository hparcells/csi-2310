package com.hunterparcells.csi2310.work.linkedlist;

public class IntLinkedList {
    private IntNode head;
    private IntNode tail;

    public IntLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToStart(int value) {
        IntNode newNode;
        if(this.head == null) {
            newNode = new IntNode(value, null, null);

            this.tail = newNode;
        }else {
            newNode = new IntNode(value, this.head, null);
            this.head.setPrevious(newNode);
        }
        this.head = newNode;
    }

    public void addToEnd(int value) {
        IntNode newNode;

        if(this.head == null) {
            newNode = new IntNode(value, null, null);

            this.head = newNode;
        }else {
            newNode = new IntNode(value, null, this.tail);
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
    }

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

    public void removeNth(int n) {
        this.getNth(n).remove();
    }

    public void removeIndex(int index) {
        this.getIndex(index).remove();
    }

    public int size() {
        IntNode currentNode = this.head;
        int counter = 0;
        while(currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }

    public void insert(int value, int index) {
        if(index == 0) {
            this.addToStart(value);
            return;
        }
        if(index == this.size()) {
            this.addToEnd(value);
            return;
        }

        IntNode newNode = new IntNode(value, this.getIndex(index), this.getIndex(index - 1));
        this.getIndex(index - 1).setNext(newNode);
        this.getIndex(index + 1).setPrevious(newNode);
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        IntNode currentNode = this.head;
        while(currentNode != null) {
            output.append(currentNode.getValue()).append(" ");
            currentNode = currentNode.getNext();
        }
        return output.toString();
    }

    public IntNode getHead() {
        return head;
    }

    public void setHead(IntNode head) {
        this.head = head;
    }

    public IntNode getTail() {
        return tail;
    }

    public void setTail(IntNode tail) {
        this.tail = tail;
    }
}
