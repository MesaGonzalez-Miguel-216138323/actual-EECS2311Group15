package tabToXml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		primaryStage.setTitle("Converter: Text to MusicXML");
		// keep scene equal or bigger than default in fxml
	    primaryStage.setScene(new Scene(root, 800, 500)); 
		primaryStage.show();
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuitarTab gt = new GuitarTab("tab.txt");
		System.out.print(gt);
		launch(args);
	}

  
}
