package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                //rectangle tmp = new Rectangle();\
                TextField tmp = new TextField();
                //tmp.set().bind(pane.widthProperty().divide(8).multiply(j));
                //tmp.yProperty().bind(pane.heightProperty().divide(8).multiply(i));

                tmp.setLayoutX(40*j+5);
                tmp.setLayoutY(25*i+5);
                tmp.setMaxWidth(40);
                tmp.setMaxHeight(10);
                tmp.setText((int)(Math.random()*2)+"");
                tmp.setCenterShape(true);
                pane.getChildren().add(tmp);
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Problem 14.6");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
