package io.github.contrib;

import java.io.InputStream;

import javafx.scene.image.Image;

public class ImageLoader {
    public static Image load(String path) {
        final InputStream input = ImageLoader.class.getResourceAsStream(path);
        if(input == null) {
            throw new RuntimeException("Couldn't load image " + path);
        }
        return new Image(input);
    }

}
