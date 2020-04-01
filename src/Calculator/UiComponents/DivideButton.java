package Calculator.UiComponents;

import Calculator.Calculations.Divide;
import Calculator.UiLayout;
import javafx.scene.control.Button;

public class DivideButton extends Button {
    public DivideButton(UiLayout uilayout) {
        setText("/");
        setOnMouseClicked(mouseEvent -> uilayout.performCalculation(new Divide()));
    }
}
