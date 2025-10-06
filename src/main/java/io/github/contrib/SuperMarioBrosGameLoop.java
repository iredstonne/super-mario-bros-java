package io.github.contrib;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class SuperMarioBrosGameLoop extends AnimationTimer {
    private final Canvas canvas;
    private final GraphicsContext context;
    private final SpriteSheet tiles;

    public SuperMarioBrosGameLoop(Canvas canvas) {
        this.canvas = canvas;
        this.context = canvas.getGraphicsContext2D();
        this.tiles = new SpriteSheet(ImageLoader.load("/assets/tiles.png"));
        this.tiles.defineTile("ground", 0, 0);
        this.tiles.defineTile("sky", 3, 23);
    }

    @Override
    public void handle(long now) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 12; j++) {
                this.tiles.drawTile(this.context, "sky", i, j);
            }
            for (int j = 12; j < 14; j++) {
                this.tiles.drawTile(this.context, "ground", i, j);
            }
        }
    }
}
