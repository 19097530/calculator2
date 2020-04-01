package Calculator.UiComponents;

import Calculator.Calculations.Sum;
import Calculator.UiLayout;
import javafx.scene.control.Button;

public class PlusButton extends Button {
    public PlusButton(UiLayout uilayout) {
        setText("+");
        setOnMouseClicked(mouseEvent -> uilayout.performCalculation(new Sum()));
    }
}
