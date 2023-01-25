package com.hunterparcells.csi2310.work.linkedlist;

import com.hunterparcells.csi2310.core.Runnable;

import java.time.LocalDate;

public class LinkedListCode extends Runnable {
    public LinkedListCode() {
        this.setName("Linked List");
        this.setDate(LocalDate.of(2023, 1, 23));
    }

    public void run() {
        IntLinkedList linkedList = new IntLinkedList();

        linkedList.addToEnd(2);
        linkedList.addToEnd(3);
        linkedList.addToEnd(4);
        linkedList.addToStart(1);
        linkedList.removeNth(3);
        linkedList.insertAtIndex(5, 1);
        linkedList.reverse();
    }
}
