package com.hunterparcells.csi2310.core.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrameOutput extends JTextArea implements KeyListener {
    private int fontSize = 12;

    public FrameOutput() {
        super("");

        this.setEditable(false);
        this.setFont(new Font("Monospaced", Font.PLAIN, this.fontSize));
        this.addKeyListener(this);
    }

    public void log(String string) {
        this.append(string + "\n");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_EQUALS && (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK)) {
            this.fontSize++;
        }
        if(e.getKeyCode() == KeyEvent.VK_MINUS && (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK)) {
            this.fontSize--;
        }
        this.setFont(new Font("Monospaced", Font.PLAIN, this.fontSize));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing.
    }
}
