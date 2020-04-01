package Calculator.UiComponents;

import javafx.scene.control.TextField;

public class InputField extends TextField {
    public InputField() {
    }

    public int getInteger() {
        try {
            return Integer.parseInt(getText());
        }
        catch (Exception e) {
            return 0;
        }
    }
}
