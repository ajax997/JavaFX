package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.text.Style;

/**
 * Created by nguyennghi on 12/26/16.
 */
public class AlertBox {
    Stage stage;
    VBox layout;
    Scene scene;
    public AlertBox(String mess, String title) {
        stage = new Stage();
        stage.initStyle(StageStyle.UTILITY);
        layout = new VBox();
        layout.setAlignment(Pos.CENTER);

        scene = new Scene(layout, 200, 200);
        Label label = new Label(mess);
        Button button = new Button("Close");
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);
        stage.setScene(scene);
        stage.setTitle(title);
    }
    public void Show()
    {
        stage.showAndWait();
    }
}
