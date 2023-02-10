package com.hunterparcells.csi2310.work.linkedlist;

public class IntNode {
    private int value;
    private IntNode next;
    private IntNode previous;

    public IntNode(int value, IntNode next, IntNode previous) {
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

    public IntNode getNext() {
        return this.next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    public IntNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(IntNode previous) {
        this.previous = previous;
    }
}