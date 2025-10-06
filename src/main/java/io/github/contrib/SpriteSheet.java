package io.github.contrib;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class SpriteSheet {

    private final Image source;

    private final Map<String, Image> sprites;

    public SpriteSheet(Image source) {
        this.source = source;
        this.sprites = new HashMap<>();
    }

    public void define(String name, int x, int y, int width, int height) {
        this.sprites.put(name, null);
    }

    public void draw(GraphicsContext context) {
        context.drawImage(this.source, 0, 0);
    }

}
