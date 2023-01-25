package com.hunterparcells.csi2310.work.linkedlist;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;
import com.hunterparcells.csi2310.work.linkedlist.doublelinkedlist.DoubleLinkedList;

import java.time.LocalDate;

public class LinkedListCode extends Runnable {
    public LinkedListCode() {
        this.setName("Linked List");
        this.setDate(LocalDate.of(2023, 1, 23));
    }

    public void run() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        Logger.log("Adding \"2\" to the end.");
        doubleLinkedList.addToEnd(2);
        Logger.log(doubleLinkedList.toString());
        Logger.log("\n");

        Logger.log("Adding \"3\" to the end.");
        doubleLinkedList.addToEnd(3);
        Logger.log(doubleLinkedList.toString());
        Logger.log("\n");

        Logger.log("Adding \"4\" to the end.");
        doubleLinkedList.addToEnd(4);
        Logger.log(doubleLinkedList.toString());
        Logger.log("\n");

        Logger.log("Adding \"1\" to the start.");
        doubleLinkedList.addToStart(1);
        Logger.log(doubleLinkedList.toString());
        Logger.log("\n");

        Logger.log("Removing the third node.");
        doubleLinkedList.removeNth(3);
        Logger.log(doubleLinkedList.toString());
        Logger.log("\n");
    }
}
