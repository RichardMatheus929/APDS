package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Produtos.Final;
import View.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controllerteladois implements Initializable {
	
	Alert a = new Alert(Alert.AlertType.INFORMATION);
	
	public static double total;
	
	@FXML
	private Button botaoremove;
	
	@FXML
    private Button botaoatualizar;

    @FXML
    private Button botaoavancar;

    @FXML
    private Button botaovoltar;

    @FXML
    private TableColumn<Final, Integer> id;

    @FXML
    private TableColumn<Final, String> nome;

    @FXML
    private Button placamae;

    @FXML
    private TableColumn<Final, Double> preco;
    
    @FXML
    private Label labeltotal;

    @FXML
    private Button ram0;

    @FXML
    private Button ram1;

    @FXML
    private TableView<Final> tabelaprodutos;
    
    private ObservableList<Final> list = FXCollections.observableArrayList();

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		id.setCellValueFactory(new PropertyValueFactory<Final,Integer>("id"));
		preco.setCellValueFactory(new PropertyValueFactory<Final,Double>("valor"));
		nome.setCellValueFactory(new PropertyValueFactory<Final,String>("nomeproduto"));
		
		tabelaprodutos.setItems(list);
	}
    
    @FXML
    void refresh() {
    	
    	labeltotal.setText(Double.toString(total));

    }
    
    public void removendo() {
    	Final finalselect = tabelaprodutos.getSelectionModel().getSelectedItem();
    	if(finalselect != null) {
    		list.remove(finalselect);
    		total = total - finalselect.getValor();
    		Controllerteladois.this.refresh();
    	tabelaprodutos.refresh();
    	}
    }
    
    @FXML
    void remove(ActionEvent event) {
    	
    	Controllerteladois.this.removendo();
    	

    }
    
    
    @FXML
    void addplacamae(ActionEvent event) {
    	
    	Final f = new Final();
    	f.setId(3);
    	f.setNomeproduto("Placa mãe asus");
    	f.setValor(500.99);
    	total = total + f.getValor();
    	
    	list.add(f);
    	tabelaprodutos.refresh();
    	f.sucesso();
    	Controllerteladois.this.refresh();
    	

    }

    @FXML
    void addram0(ActionEvent event) {
    	
    	Final f = new Final();
    	f.setId(0);
    	f.setNomeproduto("Ram 8gb");
    	f.setValor(300.99);
    	total = total + f.getValor();
    	
    	list.add(f);
    	tabelaprodutos.refresh();
    	f.sucesso();
    	Controllerteladois.this.refresh();
    	

    }

    @FXML
    void addram1(ActionEvent event) {
    	
    	Final f = new Final();
    	f.setId(1);
    	f.setNomeproduto("Ram 4gb");
    	f.setValor(200.99);
    	total = total + f.getValor();
    	
    	list.add(f);
    	tabelaprodutos.refresh();
    	f.sucesso();
    	Controllerteladois.this.refresh();

    }
    
 

    @FXML
    void avancar(ActionEvent event) {
    	
    	Main.mudartela(3);

    }

    @FXML
    void voltar(ActionEvent event) {
    	
    	Main.mudartela(1);

    }

}
