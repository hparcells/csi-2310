package com.hunterparcells.csi2310.game;

import com.hunterparcells.csi2310.game.core.Frame;
import com.hunterparcells.csi2310.game.gfx.Assets;
import com.hunterparcells.csi2310.game.gfx.Tiles;

public class Game implements Runnable {
    private final String name;
    private final int width;
    private final int height;

    private Frame frame;

    public Game(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public void run() {
        Assets.init();

        this.frame = new Frame(this.name, this.width, this.height);
        Tiles.grass.render(this.frame.getCanvas().getGraphics(), 0, 0);
    }
}
