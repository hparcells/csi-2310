package com.hunterparcells.csi2310.core.frame;

import javax.swing.*;

public class FrameOutput extends JTextArea {
    public FrameOutput() {
        super("");

        this.setEditable(false);
    }

    public void log(String string) {
        this.append(string + "\n");
    }
}
