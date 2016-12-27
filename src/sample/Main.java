package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends javafx.application.Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        com.apple.eawt.Application application = com.apple.eawt.Application.getApplication();
        java.awt.Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
        application.setDockIconImage(image);
        

        VBox layout = new VBox();
        Button button = new Button("Show Message Box!");
        layout.getChildren().addAll(button);
        button.setOnAction(e->{
            AlertBox alertBox = new AlertBox("Hello", "Title");
            alertBox.Show();
        });
        primaryStage.setScene(new Scene(layout, 500,500));
        primaryStage.getIcons().add(new Image("file:icon.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
