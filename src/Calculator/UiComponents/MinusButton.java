package Calculator.UiComponents;

import Calculator.Calculations.Subtract;
import Calculator.UiLayout;
import javafx.scene.control.Button;


public class MinusButton extends Button {
    public MinusButton(UiLayout uilayout) {
        setText("-");
        setOnMouseClicked(mouseEvent -> uilayout.performCalculation(new Subtract()));
    }
}
