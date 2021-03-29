package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    public void sendMsg() {
        textArea.appendText("User: " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    @FXML
    public void removeMsg() {
        textArea.clear();
        textField.requestFocus();
    }


}
