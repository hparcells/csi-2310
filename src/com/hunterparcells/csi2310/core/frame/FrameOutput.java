package com.hunterparcells.csi2310.core.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class FrameOutput extends JTextArea implements KeyListener, MouseWheelListener {
    private static final int DEFAULT_FONT_SIZE = 12;

    private int fontSize = DEFAULT_FONT_SIZE;
    private boolean hasControlPressed = false;

    public FrameOutput() {
        super("");

        this.setEditable(false);
        this.setFont(new Font("Monospaced", Font.PLAIN, this.fontSize));
        this.addKeyListener(this);
        this.addMouseWheelListener(this);
    }

    public void log(String string) {
        this.append(string + "\n");
    }

    public void log(String string, boolean newLine) {
        if(newLine) {
            this.append(string + "\n");
            return;
        }
        this.append(string);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_CONTROL) {
            this.hasControlPressed = true;
        }

        // Zoom using control + +/-.
        if(this.hasControlPressed) {
            if(e.getKeyCode() == KeyEvent.VK_EQUALS) {
                this.fontSize++;
            }
            if(e.getKeyCode() == KeyEvent.VK_MINUS) {
                this.fontSize--;
            }
            if(e.getKeyCode() == KeyEvent.VK_0) {
                this.fontSize = DEFAULT_FONT_SIZE;
            }
            this.setFont(new Font("Monospaced", Font.PLAIN, this.fontSize));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_CONTROL) {
            this.hasControlPressed = false;
        }
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        // Zoom if the control key is pressed.
        if(this.hasControlPressed) {
            int notches = e.getWheelRotation();
            if(notches < 0) {
                this.fontSize++;
            }else {
                this.fontSize--;
            }
            this.setFont(new Font("Monospaced", Font.PLAIN, this.fontSize));
        }
    }
}
