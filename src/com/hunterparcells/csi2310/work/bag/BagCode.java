package com.hunterparcells.csi2310.work.bag;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import java.time.LocalDate;

public class BagCode extends Runnable {
    public BagCode() {
        this.setName("Bag");
        this.setDate(LocalDate.of(2023, 1, 18));
    }

    public void run() {
        // Create a new bag.
        final Bag bag = new Bag(10);

        // Add some items to the bag.
        bag.add("Item 1");
        bag.add("Item 2");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");
        bag.add("Item 3");

        // Print the items in the bag.
        for(Object item : bag.getBag()) {
            Logger.log(item.toString());
        }
    }
}
