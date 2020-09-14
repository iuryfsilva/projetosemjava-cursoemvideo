
package com.xemacscode.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button botao1 = new Button("Hello World");
        StackPane root = new StackPane();
        root.getChildren().add(botao1);
        Scene cenario = new Scene(root, 600, 400);
        stage.setScene(cenario);
        stage.setTitle("Primeira aplicação JavaFX");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
