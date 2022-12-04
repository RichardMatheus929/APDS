package Controller;

import View.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controllertelaum {

    @FXML
    private Button botaomudartela;

    @FXML
    private Label erro;

    @FXML
    private PasswordField senha;

    @FXML
    private TextField usuario;
    

    @FXML
    void mudartela(ActionEvent event) {

    	String usuariocerto;
    	String senhacerto;
    	String usuariocode;
    	String senhacode;
    	
    	usuariocerto = "Lucas";
    	senhacerto = "1234";
    	usuariocode = usuario.getText();
    	senhacode = senha.getText();
    	
    	if (usuariocode.equals(usuariocerto) && senhacode.equals(senhacerto)) {
    		
    		Main.mudartela(2);
    		
    		
    	} else {
    		
    		Alert a = new Alert(Alert.AlertType.WARNING);
    		a.setTitle("Senha inválida");
    		a.setHeaderText("Tente novamente");
    		a.showAndWait();
    		
    	
    	}
    	
    	}

    }


