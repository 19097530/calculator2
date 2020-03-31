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
    private AwesomeCalculator calculator;
    private InputLabel result;

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

        HBox line3 = new HBox();
        result = new InputLabel("Result: ");
        line3.getChildren().add(result);

        VBox idk = new VBox();
        idk.getChildren().addAll(Arrays.asList(line1, line2, line3));
        root.getChildren().addAll(idk);
        calculator = new AwesomeCalculator();
    }

    public void sum() {
        showResult(calculator.sum(getNumber1(), getNumber2()));
    }

    public void divide() {
        showResult(calculator.divide(getNumber1(), getNumber2()));
    }

    public void minus() {
        showResult(calculator.subtract(getNumber1(), getNumber2()));
    }

    public void multiply() {
        showResult(calculator.multiply(getNumber1(), getNumber2()));
    }

    public int getNumber1() {
        try {
            return Integer.parseInt(number1.getText());
        }
        catch (Exception e) {
            return 0;
        }
    }

    public int getNumber2() {
        try {
            return Integer.parseInt(number2.getText());
        }
        catch (Exception e) {
            return 0;
        }
    }

    public void showResult(double result) {
        this.result.setText("Result: " + result);
    }
}
