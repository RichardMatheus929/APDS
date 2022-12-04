package View;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage stage;
	private static Scene um;
	private static Scene dois;
	private static Scene tres;
	
	
	public static void mudartela(int src) {
		
		switch(src) {
		case 1: stage.setScene(um);
			break;
		case 2: stage.setScene(dois);
			break;
		case 3: stage.setScene(tres);
			break;
		}
	}
	
	
	
	public void start(Stage primaryStage) {
		
		try {
			
			stage = primaryStage;
			primaryStage.setTitle("crytech");
			primaryStage.getIcons().add(new Image ("file:///C:/Users/richa/eclipse-workspace/apds_01/src/images/Logopag.jpg"));
			
			BorderPane telaum = FXMLLoader.load(getClass().getResource("telaum.fxml"));
			um = new Scene(telaum,590,545);
			
			
			ScrollPane teladois = FXMLLoader.load(getClass().getResource("teladois.fxml"));
			dois = new Scene(teladois,784,545);
			
			BorderPane telatres = FXMLLoader.load(getClass().getResource("telatres.fxml"));
			tres = new Scene(telatres,590,545);

			
			primaryStage.setScene(um);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
