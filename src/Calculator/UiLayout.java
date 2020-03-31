package Calculator;

import Calculator.UiComponents.InputField;
import Calculator.UiComponents.PlusButton;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UiLayout {

    private Pane root;
    private InputField number1;
    private InputField number2;
    private PlusButton plusButton;

    public UiLayout(Stage primaryStage) {
        root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        VBox line1 = new VBox();

        number1 = new InputField();
        number2 = new InputField();
        line1.getChildren().add(number1);
        line1.getChildren().add(number2);

        VBox line2 = new VBox();
        plusButton = new PlusButton(this);
        line2.getChildren().add(plusButton);

        root.getChildren().add(line1);
        root.getChildren().add(line2);
    }

    public void sum() {

    }
}
