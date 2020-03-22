package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Rectangle tmp = new Rectangle();
                tmp.xProperty().bind(pane.widthProperty().divide(8).multiply(j));
                tmp.yProperty().bind(pane.heightProperty().divide(8).multiply(i));
                tmp.widthProperty().bind(pane.widthProperty().divide(8));
                tmp.heightProperty().bind(pane.heightProperty().divide(8));
                if((i%2==0&&j%2==0)||(i%2==1&&j%2==1))
                    tmp.setFill(Color.WHITE);
                else
                    tmp.setFill(Color.BLACK);
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
