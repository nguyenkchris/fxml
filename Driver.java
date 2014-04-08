// Driver.java

package fxml_tutorial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver {

    public static void main(String[] a) {
	
    } // main

    @Override public void start(Stage stage) throws Exception {
	Parent root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
	Scene scene = new Scene(root, 300, 275);
	
	stage.setTitle("My First FXML Program!");
	stage.setScene(scene);
	stage.show();
    } // start

} // Driver