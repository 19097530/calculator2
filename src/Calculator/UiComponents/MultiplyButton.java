package Calculator.UiComponents;

import Calculator.UiLayout;
import javafx.scene.control.Button;

public class MultiplyButton extends Button {
    public MultiplyButton(UiLayout uilayout) {
        setText("*");
        setOnMouseClicked(mouseEvent -> multiply());
    }
}
