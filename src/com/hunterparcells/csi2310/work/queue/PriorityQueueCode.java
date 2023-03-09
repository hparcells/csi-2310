package com.hunterparcells.csi2310.work.queue;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import java.time.LocalDate;

public class PriorityQueueCode extends Runnable {
    public PriorityQueueCode() {
        this.setName("Priority Queue");
        this.setDate(LocalDate.of(2023, 3, 8));
    }

    @Override
    public void run() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.enqueue(5, false);
        Logger.log(queue);
        queue.enqueue(6, false);
        Logger.log(queue);
        queue.enqueue(7, false);
        Logger.log(queue);
        queue.enqueue(1, true);
        Logger.log(queue);
        queue.enqueue(2, true);
        Logger.log(queue);
        queue.enqueue(3, true);
        Logger.log(queue);

        int dequeued1 = queue.dequeue(true);
        Logger.log(queue);
        Logger.log(dequeued1);
        // Should be 1.

        int dequeued2 = queue.dequeue(false);
        Logger.log(queue);
        Logger.log(dequeued2);
        // Should be 5.

        queue.enqueue(9, true);
        Logger.log(queue);
        queue.enqueue(9, true);
        Logger.log(queue);
        queue.enqueue(9, true);
        Logger.log(queue);
        queue.enqueue(9, true);
        Logger.log(queue);
        queue.enqueue(9, true);
        Logger.log(queue);
        queue.enqueue(9, true);
        Logger.log(queue);

        // Should error.
        queue.enqueue(9, true);
        Logger.log(queue);
    }
}
