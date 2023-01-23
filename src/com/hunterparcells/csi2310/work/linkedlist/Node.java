package com.hunterparcells.csi2310.work.linkedlist;

public class Node {
    private int value;
    private Node next;
    private Node previous;

    public Node(int value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public void remove() {
        if(this.next != null) {
            this.next.setPrevious(this.previous);
        }else {
            this.previous.setNext(null);
        }
        if(this.previous != null) {
            this.previous.setNext(this.next);
        }else {
            this.next.setPrevious(null);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
