package com.hunterparcells.csi2310.core.frame;

import com.hunterparcells.csi2310.core.Runnable;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private final Runnable[] labs;

    private FrameOutput output;

    public Frame(Runnable[] labs) {
        super("CSI 2310");

        this.labs = labs;
    }

    // TODO: Make the frame better.
    public void initFrame() {
        // Init frame.
        this.setTitle("CSI 2310");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.RED);
        this.setLayout(new GridLayout(1, 2));
        this.setBackground(Color.WHITE);

        // Add lab selector.
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        LabSelector labSelector = new LabSelector(this.labs);
        leftPanel.add(labSelector);
        this.add(leftPanel);

        // Add output.
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.output = new FrameOutput();
        rightPanel.add(this.output, BorderLayout.CENTER);
        this.add(rightPanel);

        // We're ready.
        this.getOutput().log("Ready.");
        this.setVisible(true);
    }

    public FrameOutput getOutput() {
        return this.output;
    }
}
