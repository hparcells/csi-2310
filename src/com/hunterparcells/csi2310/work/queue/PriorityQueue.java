package com.hunterparcells.csi2310.work.queue;

/**
 * A queue with a priority queue.
 */
public class PriorityQueue {
    private final int size;

    private int priorityHead = 0;
    private int priorityTail = 0;
    private int regularHead = 0;
    private int regularTail = 0;

    private final int[] priorityQueue;
    private final int[] regularQueue;

    /**
     * Create a new priority queue.
     *
     * @param size The size of the queue.
     */
    public PriorityQueue(int size) {
        this.size = size;

        priorityQueue = new int[size];
        regularQueue = new int[size];
    }

    /**
     * Enqueue data into the queue.
     *
     * @param data       The data to enqueue.
     * @param isPriority Whether the data is priority.
     */
    public void enqueue(int data, boolean isPriority) {
        if((this.priorityHead - this.priorityTail) + (this.regularHead - this.regularTail) >= this.size) {
            throw new RuntimeException("Queue is full");
        }

        if(isPriority) {
            this.priorityQueue[this.priorityHead++] = data;
            return;
        }
        regularQueue[regularHead++] = data;
    }

    /**
     * Dequeue data from the queue.
     *
     * @param isPriority Whether to dequeue from the priority queue or the regular queue.
     *
     * @return The data that was dequeued.
     */
    public int dequeue(boolean isPriority) {
        if(isPriority && this.priorityTail == this.priorityHead) {
            throw new RuntimeException("Priority queue is empty");
        }
        if(!isPriority && this.regularTail == this.regularHead) {
            throw new RuntimeException("Regular queue is empty");
        }

        if(isPriority) {
            return this.priorityQueue[this.priorityTail++];
        }
        return this.regularQueue[this.regularTail++];
    }

    /**
     * Represents the queue as a string. Priority queue is to the left of the "|" and regular queue is to the right.
     *
     * @return The queue as a string.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = this.priorityTail; i < this.priorityHead; i++) {
            sb.append(this.priorityQueue[i]).append(" ");
        }
        sb.append(" | ");
        for(int i = this.regularTail; i < this.regularHead; i++) {
            sb.append(this.regularQueue[i]).append(" ");
        }
        return sb.toString();
    }

    public int getSize() {
        return this.size;
    }

    public int getPriorityHead() {
        return priorityHead;
    }

    public void setPriorityHead(int priorityHead) {
        this.priorityHead = priorityHead;
    }

    public int getPriorityTail() {
        return priorityTail;
    }

    public void setPriorityTail(int priorityTail) {
        this.priorityTail = priorityTail;
    }

    public int getRegularHead() {
        return regularHead;
    }

    public void setRegularHead(int regularHead) {
        this.regularHead = regularHead;
    }

    public int getRegularTail() {
        return regularTail;
    }

    public void setRegularTail(int regularTail) {
        this.regularTail = regularTail;
    }

    public int[] getPriorityQueue() {
        return priorityQueue;
    }

    public int[] getRegularQueue() {
        return regularQueue;
    }
}
