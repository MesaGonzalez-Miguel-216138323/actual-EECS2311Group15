package tabToXml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Converter: Text to MusicXML");
		// keep scene equal or bigger than default in fxml - 800x500
	    primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Home.fxml")),800, 500)); 
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.print("Launching Application");
		launch(args);
<<<<<<< HEAD
		//useless comment
		//lab task elijah-third try
		//in the develop
		

=======
		//useless comment by miguel
<<<<<<< HEAD
>>>>>>> refs/heads/miguel's_second_branch
=======
		//lab task-miguel
>>>>>>> refs/heads/miguel's_second_branch
	}

  
}
