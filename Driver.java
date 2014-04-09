// Driver.java

//package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends Application {

    public static void main(String[] args) {
	Application.launch(Driver.class, args);
    } // main

    @Override public void start(Stage stage) throws Exception {
	Parent root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
	Scene scene = new Scene(root, 300, 275);
	
	stage.setTitle("My First FXML Program!");
	stage.setScene(scene);
	stage.show();
    } // start

} // Driver