package com.hunterparcells.csi2310.work.linkedlist;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import java.time.LocalDate;

public class LinkedListCode extends Runnable {
    public LinkedListCode() {
        this.setName("Linked List");
        this.setDate(LocalDate.of(2023, 1, 23));
    }

    public void run() {
        LinkedList linkedList = new LinkedList();

        Logger.log("Adding \"2\" to the end.");
        linkedList.addToEnd(2);
        Logger.log(linkedList.toString());
        Logger.log("\n");

        Logger.log("Adding \"3\" to the end.");
        linkedList.addToEnd(3);
        Logger.log(linkedList.toString());
        Logger.log("\n");

        Logger.log("Adding \"4\" to the end.");
        linkedList.addToEnd(4);
        Logger.log(linkedList.toString());
        Logger.log("\n");

        Logger.log("Adding \"1\" to the start.");
        linkedList.addToStart(1);
        Logger.log(linkedList.toString());
        Logger.log("\n");

        Logger.log("Removing the third node.");
        linkedList.removeNth(3);
        Logger.log(linkedList.toString());
        Logger.log("\n");
    }
}
