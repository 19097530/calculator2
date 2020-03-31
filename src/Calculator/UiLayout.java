import UiComponents.InputField;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UiLayout {


    public UiLayout(Stage primaryStage) {
        Pane root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        InputField number1 = new InputField();
        root.getChildren().add(number1);
    }
}
