package Calculator.UiComponents;

import Calculator.Calculations.Multiply;
import Calculator.UiLayout;
import javafx.scene.control.Button;

public class MultiplyButton extends Button {
    public MultiplyButton(UiLayout uilayout) {
        setText("*");
        setOnMouseClicked(mouseEvent -> uilayout.performCalculation(new Multiply()));
    }
}
