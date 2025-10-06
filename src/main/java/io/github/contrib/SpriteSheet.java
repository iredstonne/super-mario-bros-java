package io.github.contrib;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class SpriteSheet {

    private final Image source;

    private final Map<String, Sprite> sprites;

    public SpriteSheet(Image source) {
        this.source = source;
        this.sprites = new HashMap<>();
    }

    public void defineTile(String spriteName, double tileX, double tileY) {
        this.defineSprite(spriteName, tileX * 16, tileY * 16, 16, 16);
    }

    public void defineSprite(String spriteName, double spriteX, double spriteY, double spriteWidth, double spriteHeight) {
        this.sprites.put(spriteName, new Sprite(this.source, spriteX, spriteY, spriteWidth, spriteHeight));
    }

    public void drawTile(GraphicsContext context, String spriteName, double x, double y) {
        this.drawSprite(context, spriteName, x * 16, y * 16, 16, 16);
    }

    public void drawSprite(GraphicsContext context, String spriteName, double x, double y, double width, double height) {
        final Sprite sprite = this.sprites.get(spriteName);
        if(sprite == null) {
            throw new RuntimeException("Couldn't find sprite " + spriteName);
        }
        sprite.drawImage(context, x, y, width, height);
    }

}
