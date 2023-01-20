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

    // TODO: Put components in their own classes.
    public void initFrame() {
        // Init frame.
        this.setTitle("CSI 2310 Code Runner");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon icon = new ImageIcon("res/icon.png");
        this.setIconImage(icon.getImage());

        // Lab selector.
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        LabSelector labSelector = new LabSelector(this.labs);
        labSelector.setMaximumSize(labSelector.getPreferredSize());
        topPanel.add(labSelector, BorderLayout.CENTER);
        JButton stopButton = new JButton("STOP");
        try {
            stopButton.addActionListener(e -> labSelector.getThread().interrupt());
        }catch(NullPointerException e) {
            // Do nothing.
        }
        topPanel.add(stopButton, BorderLayout.EAST);

        // Output.
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.output = new FrameOutput();
        bottomPanel.add(this.output, BorderLayout.CENTER);

        @SuppressWarnings("SuspiciousNameCombination")
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topPanel, bottomPanel);
        this.add(splitPane);

        // We're ready.
        this.getOutput().log("Ready.");
        this.setVisible(true);
    }

    public FrameOutput getOutput() {
        return this.output;
    }
}
