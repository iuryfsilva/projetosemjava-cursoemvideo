/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Iury Silva
 */
public class HelloFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Hello FXML.fxml"));
        Scene cenario = new Scene(root);
        stage.setTitle("Hello World");
        stage.setScene(cenario);
        stage.show();
    }
    
    public static void main(String[] args) {
       launch(args); 
    }
}
