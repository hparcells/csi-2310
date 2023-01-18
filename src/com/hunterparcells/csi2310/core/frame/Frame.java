package com.hunterparcells.csi2310.core.frame;

import com.hunterparcells.csi2310.core.Lab;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private final Lab[] labs;

    private FrameOutput output;
    private LabSelector labSelector;

    public Frame(Lab[] labs) {
        super("CSI 2310");

        this.labs = labs;
    }

    public void initFrame() {
        // Init frame.
        JPanel panel = new JPanel();

        // Setup the frame.
        this.setTitle("CSI 2310");
        this.setSize(500, 300);
        panel.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Add lab selector.
        this.labSelector = new LabSelector(this.labs);
        this.add(this.labSelector, BorderLayout.NORTH);

        // Add output.
        this.output = new FrameOutput();
        this.add(this.output, BorderLayout.SOUTH);

        this.getOutput().log("Ready.");
        this.setVisible(true);
    }

    public FrameOutput getOutput() {
        return this.output;
    }
}
