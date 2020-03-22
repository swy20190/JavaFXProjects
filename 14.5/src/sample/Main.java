package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new StackPane();
        String target = "WELCOME TO JAVA ";
        for(int i=0;i<target.length();i++){
            Text tmp = new Text(target.charAt(i)+"\n \n \n \n \n \n \n");
            tmp.setRotate(24*i);
            pane.getChildren().add(tmp);
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Problem 14.5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
