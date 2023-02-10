package com.hunterparcells.csi2310.work.linkedlist;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.work.linkedlist.doublelinkedlist.IntDoubleLinkedList;

import java.time.LocalDate;

public class LinkedListCode extends Runnable {
    public LinkedListCode() {
        this.setName("Linked List");
        this.setDate(LocalDate.of(2023, 1, 23));
    }

    public void run() {
        IntDoubleLinkedList linkedList = new IntDoubleLinkedList();

        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.unshift(1);
        linkedList.removeNth(3);
        linkedList.insertAtIndex(5, 1);
        linkedList.reverse();
    }
}
