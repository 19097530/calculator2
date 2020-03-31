package Calculator.UiComponents;

import Calculator.UiLayout;
import javafx.scene.control.Button;

public class PlusButton extends Button {
    public PlusButton(UiLayout uilayout) {
        setText("+");
        setOnMouseClicked(mouseEvent -> sum());
    }
}
