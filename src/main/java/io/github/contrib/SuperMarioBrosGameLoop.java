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
    }

    @Override
    public void handle(long now) {
        this.tiles.draw(this.context);
    }
}
