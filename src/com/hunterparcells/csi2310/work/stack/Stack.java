package com.hunterparcells.csi2310.work.stack;

import com.hunterparcells.csi2310.util.Logger;

public class Stack {
    int size;
    int top;
    int[] stack;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full.");
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }else {
            this.stack[++this.top] = data;
        }
    }

    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty.");
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }else {
            return this.stack[this.top--];
        }
    }

    public void dumpStack() {
        Logger.log("Stack (top down):");
        for(int i = this.top; i >= 0; i--) {
            Logger.log(this.stack[i]);
        }
        Logger.log("\n");
    }
}
