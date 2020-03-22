package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FlowPane pane = new FlowPane();
        pane.setOrientation(Orientation.HORIZONTAL);
        for(int i=0;i<5;i++){
            Text tmp = new Text("Java");
            tmp.setFont(Font.font("Times New Roman", FontWeight.BLACK, FontPosture.ITALIC,22));
            Color jj = new Color(Math.random(),Math.random(),Math.random(),Math.random());
            tmp.setFill(jj);
            tmp.setRotate(90);
            pane.getChildren().add(tmp);
        }
        //pane.setRotate(90);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("problem 14.4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
