package com.hunterparcells.csi2310.work.stack;

import com.hunterparcells.csi2310.core.Runnable;

import java.time.LocalDate;

public class StackCode extends Runnable {
    public StackCode() {
        this.setName("Stack");
        this.setDate(LocalDate.of(2023, 2, 15));
    }

    public void run() {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.dumpStack();
        stack.push(2);
        stack.dumpStack();
        stack.pop();
        stack.dumpStack();
        stack.pop();
        stack.dumpStack();
    }
}
