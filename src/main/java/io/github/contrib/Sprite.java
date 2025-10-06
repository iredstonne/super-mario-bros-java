package io.github.contrib;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite {

    private final Image image;

    private final double croppedX, croppedY;

    private final double croppedWidth, croppedHeight;

    public Sprite(Image image, double croppedX, double croppedY, double croppedWidth, double croppedHeight) {
        this.image = image;
        this.croppedX = croppedX;
        this.croppedY = croppedY;
        this.croppedWidth = croppedWidth;
        this.croppedHeight = croppedHeight;
    }

    public void drawImage(GraphicsContext context, double x, double y, double width, double height) {
        context.drawImage(this.image, this.croppedX, this.croppedY, this.croppedWidth, this.croppedHeight, x, y, width, height);
    }

}
