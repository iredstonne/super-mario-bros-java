package io.github.contrib;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SuperMarioBrosGameLoop extends AnimationTimer {
    private final Canvas canvas;
    private final GraphicsContext context;

    public SuperMarioBrosGameLoop(Canvas canvas) {
        this.canvas = canvas;
        this.context = canvas.getGraphicsContext2D();
    }

    @Override
    public void handle(long now) {
        this.context.setFill(Color.RED);
        this.context.fillRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
    }
}
