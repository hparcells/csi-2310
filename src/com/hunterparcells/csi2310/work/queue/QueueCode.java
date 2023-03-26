package com.hunterparcells.csi2310.work.queue;

import com.hunterparcells.csi2310.core.Runnable;

import java.time.LocalDate;

public class QueueCode extends Runnable {
    public QueueCode() {
        this.setName("Queue");
        this.setDate(LocalDate.of(2023, 3, 8));
    }

    @Override
    public void run() {
        RegularQueue queue = new RegularQueue(10);
    }
}
