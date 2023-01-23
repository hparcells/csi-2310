package com.hunterparcells.csi2310;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.core.frame.Frame;
import com.hunterparcells.csi2310.game.Game;
import com.hunterparcells.csi2310.work.bag.BagCode;
import com.hunterparcells.csi2310.work.lab1.Lab1;
import com.hunterparcells.csi2310.work.linkedlist.LinkedListCode;

public class Main {
    private static Frame frame;

    private static final Runnable[] labs = {
            new Lab1(),
            new BagCode(),
            new LinkedListCode()
    };

    public static void main(String[] args) {
        // The actual project.
        frame = new Frame(labs);
        frame.initFrame();

        // Game stuff.
        Game game = new Game("Game", 720, 720);
        Thread gameThread = new Thread(game);
        // gameThread.start();
    }

    public static Frame getFrame() {
        return frame;
    }
}
