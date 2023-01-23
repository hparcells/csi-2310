package com.hunterparcells.csi2310.game.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Renderable {
    BufferedImage image;

    public Renderable(BufferedImage image) {
        this.image = image;
    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(image, x, y, null);
    }
}
