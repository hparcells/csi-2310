package com.hunterparcells.csi2310.util;

import com.hunterparcells.csi2310.Main;
import com.hunterparcells.csi2310.core.frame.Frame;

import javax.swing.*;

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
    public static void log(Object string) {
        frame.getOutput().log(string.toString());

        // FIXME: This doesn't work.
        JScrollBar vertical = frame.getScrollPane().getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }

    /**
     * Logs to the in-frame display.
     *
     * @param string  The string to long.
     * @param newLine Whether to log on a new line.
     */
    public static void log(Object string, boolean newLine) {
        frame.getOutput().log(string.toString(), newLine);

        // FIXME: This doesn't work.
        JScrollBar vertical = frame.getScrollPane().getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }

    /**
     * Clears the in-frame display.
     */
    public static void clear() {
        frame.getOutput().setText("");
    }
}
