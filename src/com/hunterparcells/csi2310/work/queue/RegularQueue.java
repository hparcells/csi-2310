package com.hunterparcells.csi2310.work.queue;

/**
 * This has to be the stupidest thing I've ever seen.
 */
public class RegularQueue {
    private int[] queue;
    private int size, head, tail;

    public RegularQueue(int size) {
        this.size = size;
        this.head = -1;
        this.tail = 0;
        this.queue = new int[size];
    }

    public void enqueue(int newData) {
        this.queue[tail] = newData;

        if(tail == size - 1) {
            tail = 0;
            return;
        }
        tail++;
    }

    public int dequeue() {
        int element = this.queue[head++];

        if(head == size - 1) {
            head = 0;
        }else {
            head++;
        }
        return element;
    }
}
