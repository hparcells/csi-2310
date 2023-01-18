package com.hunterparcells.csi2310.util;

import com.hunterparcells.csi2310.Main;
import com.hunterparcells.csi2310.core.frame.Frame;

public final class Logger {
    private static Frame frame = Main.getFrame();

    public Logger(Frame frameInstance) {
        frame = frameInstance;
    }

    public static void log(String string) {
        frame.getOutput().log(string);
    }
}
