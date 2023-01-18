package com.hunterparcells.csi2310;

import com.hunterparcells.csi2310.core.Lab;
import com.hunterparcells.csi2310.core.frame.Frame;
import com.hunterparcells.csi2310.lab1.Lab1;

public class Main {
    private static Frame frame;

    private static final Lab[] labs = {
            new Lab1()
    };

    public static void main(String[] args) {
        frame = new Frame(labs);
        frame.initFrame();
    }

    public static Frame getFrame() {
        return frame;
    }
}
