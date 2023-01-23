package com.hunterparcells.csi2310.game.gfx;

import java.awt.image.BufferedImage;

public class WorldRenderable extends Renderable {
    private final String code;

    public WorldRenderable(BufferedImage image, String code) {
        super(image);

        this.code = code;
    }

    public String getCode() {
        return code;
    }
}