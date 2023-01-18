package com.hunterparcells.csi2310.util;

import com.hunterparcells.csi2310.Main;
import com.hunterparcells.csi2310.core.frame.Frame;

/**
 * Program logger.
 */
public final class Logger {
    private static Frame frame = Main.getFrame();

    public Logger(Frame frameInstance) {
        frame = frameInstance;
    }

    /**
     * Logs to the in-frame display on a new line.
     *
     * @param string The string to long.
     */
    public static void log(String string) {
        frame.getOutput().log(string);
    }

    /**
     * Clears the in-frame display.
     */
    public static void clear() {
        frame.getOutput().setText("");
    }
}
