package Produtos;

import javafx.scene.control.Alert;
import Controller.Controllerteladois;

public class Final extends Controllerteladois{
	
	String nomeproduto;
	
	int id;
	
	double valor;

	public String getNomeproduto() {
		return nomeproduto;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	
	public void sucesso() {
		
		Alert a = new Alert(Alert.AlertType.INFORMATION);
		a.setTitle("Sucesso!");
		a.setHeaderText("Seu produto foi adicionado.");
		a.showAndWait();
	
		
		
	}
	
	

	

	
	
	
	
	
	

}
