package com.hunterparcells.csi2310;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.core.frame.Frame;
import com.hunterparcells.csi2310.work.bag.BagCode;
import com.hunterparcells.csi2310.work.lab1.Lab1;

public class Main {
    private static Frame frame;

    private static final Runnable[] labs = {
            new Lab1(),
            new BagCode()
    };

    public static void main(String[] args) {
        frame = new Frame(labs);
        frame.initFrame();
    }

    public static Frame getFrame() {
        return frame;
    }
}
