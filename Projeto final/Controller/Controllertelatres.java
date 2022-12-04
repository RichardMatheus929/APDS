package Controller;

import View.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controllertelatres {

    @FXML
    private Button add;

    @FXML
    private TableColumn<?, ?> id1;

    @FXML
    private TableColumn<?, ?> nome;

    @FXML
    private TableColumn<?, ?> preco;

    @FXML
    private TableView<?> tabelaprodutos;

    @FXML
    private Button voltar;

    @FXML
    void addtable(ActionEvent event) {

    }

    @FXML
    void volta(ActionEvent event) {
    	Main.mudartela(2);

    }

}
