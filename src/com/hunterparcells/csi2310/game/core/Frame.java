package com.hunterparcells.csi2310.game.core;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private final Canvas canvas;

    public Frame(String name, int width, int height) {
        super(name);

        // Init
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("res/icon.png");
        this.setIconImage(icon.getImage());

        // Canvas
        this.canvas = new Canvas();
        this.canvas.setMinimumSize(new Dimension(width, height));
        this.canvas.setMaximumSize(new Dimension(width, height));
        this.canvas.setPreferredSize(new Dimension(width, height));

        // We're ready.
        this.add(this.canvas);
        this.pack();
        this.setVisible(true);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
