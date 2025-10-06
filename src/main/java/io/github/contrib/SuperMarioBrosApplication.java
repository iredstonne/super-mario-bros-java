package io.github.contrib;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SuperMarioBrosApplication extends Application {
    @Override
    public void start(Stage stage) {
        StackPane pane = new StackPane();
        Canvas canvas = new Canvas();
        canvas.widthProperty().bind(pane.widthProperty());
        canvas.heightProperty().bind(pane.heightProperty());
        pane.getChildren().add(canvas);
        SuperMarioBrosGameLoop gameLoop = new SuperMarioBrosGameLoop(canvas);
        stage.setTitle("Super Mario Bros Java");
        stage.setScene(new Scene(pane, 1280, 720));
        stage.show();
        gameLoop.start();
    }
}
