package com.hunterparcells.csi2310.work.recursion;

public class recursionWorker {

    public static void main(String[] args) {
        MaxFinder w = new MaxFinder(4);

        w.insertInt(3);
        w.insertInt(7);
        w.insertInt(5);
        w.insertInt(9);

        int result = w.findMax(0, 3);
        System.out.println(result);
    }
}
