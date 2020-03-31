package Calculator;

import Calculator.UiComponents.*;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class UiLayout {

    private Pane root;
    private InputField number1;
    private InputField number2;
    private PlusButton plusButton;
    private MultiplyButton multiplyButton;
    private MinusButton minusButton;
    private DivideButton divideButton;

    public UiLayout(Stage primaryStage) {
        root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        VBox line1 = new VBox();

        HBox number1Container = new HBox();
        HBox number2Container = new HBox();

        number1 = new InputField();
        number2 = new InputField();
        number1Container.getChildren().addAll(Arrays.asList(new InputLabel("Number 1"), number1));
        number2Container.getChildren().addAll(Arrays.asList(new InputLabel("Number 2"), number2));

        line1.getChildren().addAll(Arrays.asList(number1Container, number2Container));

        HBox line2 = new HBox();
        plusButton = new PlusButton(this);
        multiplyButton = new MultiplyButton(this);
        divideButton = new DivideButton(this);
        minusButton = new MinusButton(this);
        line2.getChildren().addAll(Arrays.asList(plusButton, multiplyButton, divideButton, minusButton));

        VBox idk = new VBox();
        idk.getChildren().addAll(Arrays.asList(line1, line2));
        root.getChildren().addAll(idk);
    }

    public void sum() {
    }

    public void divide() {
    }

    public void minus() {
    }

    public void multiply() {
    }

    public void showResult(String result) {}
}
