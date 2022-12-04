package View;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage stage;
	private static Scene um;
	private static Scene dois;
	
	
	public static void mudartela(int src) {
		
		switch(src) {
		case 1: stage.setScene(um);
			break;
		case 2: stage.setScene(dois);
			break;
		case 3: stage.setScene(dois);
			break;
		}
	}
	
	
	
	public void start(Stage primaryStage) {
		
		try {
			
			stage = primaryStage;
			primaryStage.setTitle("crytech");
			primaryStage.getIcons().add(new Image ("C:\\Users\\richa\\Pictures\\APDS\\Logopag.jpg"));
			
			BorderPane telaum = FXMLLoader.load(getClass().getResource("telaum.fxml"));
			um = new Scene(telaum);
			
			
			BorderPane teladois = FXMLLoader.load(getClass().getResource("teladois.fxml"));
			dois = new Scene(teladois);

			
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
