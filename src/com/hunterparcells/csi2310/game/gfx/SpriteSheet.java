package com.hunterparcells.csi2310.game.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    private int width = 32;
    private int height = 32;

    private final BufferedImage image;

    public SpriteSheet(BufferedImage image) {
        this.image = image;
    }

    public SpriteSheet(BufferedImage image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    public BufferedImage grabImage(int col, int row) {
        return image.getSubimage((col * 32) - 32, (row * 32) - 32, this.width, this.height);
    }
}
