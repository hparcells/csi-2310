package com.hunterparcells.csi2310.work.binarytree;

import com.hunterparcells.csi2310.core.Runnable;

import java.time.LocalDate;

public class BinaryTreeCode extends Runnable {
    public BinaryTreeCode() {
        this.setName("Binary Tree");
        this.setDate(LocalDate.of(2023, 2, 20));
    }

    @Override
    public void run() {
        BinaryTreeNode head = new BinaryTreeNode(50);

        for(int i = 0; i < 50; i++) {
            head.insert((int) (Math.random() * 100));
        }
        head.walk();
    }
}
