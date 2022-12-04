package Controller;

import View.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controllerteladois {

    @FXML
    private Button botaodois;

    @FXML
    void change(ActionEvent event) {
    		Main.mudartela(1);
    }

}
