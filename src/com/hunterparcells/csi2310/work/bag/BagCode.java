package com.hunterparcells.csi2310.work.bag;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import java.time.LocalDate;

public class BagCode extends Runnable {
    public BagCode() {
        this.setName("BagBagBagBagBagBagBagBagBag");
        this.setDate(LocalDate.of(2023, 1, 18));
    }

    public void run() {
        // Create a new bag.
        final Bag bag = new Bag(10);

        // Add some items to the bag.
        bag.add("Item 1");
        bag.add("Item 2");
        bag.add("Item 3");
        bag.add("Item 4");
        bag.add("Item 5");
        bag.add("Item 6");
        bag.add("Item 7");
        bag.add("Item 8");
        bag.add("Item 9");
        bag.add("Item 10");

        // This should error.
        bag.add("Item 11");

        // Print the items in the bag.
        for(Object item : bag.getBag()) {
            Logger.log(item.toString());
        }
    }
}
