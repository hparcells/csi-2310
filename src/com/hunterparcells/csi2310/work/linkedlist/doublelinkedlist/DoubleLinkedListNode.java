package com.hunterparcells.csi2310.work.linkedlist.doublelinkedlist;

public class DoubleLinkedListNode {
    private int value;
    private DoubleLinkedListNode next;
    private DoubleLinkedListNode previous;

    public DoubleLinkedListNode(int value, DoubleLinkedListNode next, DoubleLinkedListNode previous) {
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

    public DoubleLinkedListNode getNext() {
        return this.next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

    public DoubleLinkedListNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(DoubleLinkedListNode previous) {
        this.previous = previous;
    }
}
