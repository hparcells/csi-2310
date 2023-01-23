package com.hunterparcells.csi2310.game.gfx;

import com.hunterparcells.csi2310.game.util.ImageLoader;

import java.awt.image.BufferedImage;

public class Assets {
    private static SpriteSheet spriteSheet;

    public static BufferedImage grass;

    public static void init() {
        spriteSheet = new SpriteSheet(ImageLoader.loadImage("res/sheet.png"));
        grass = spriteSheet.grabImage(1, 1);
    }
}
