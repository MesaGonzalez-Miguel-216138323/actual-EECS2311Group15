package tabToXml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static TextFileReader test = new TextFileReader("C:\\Users\\Elijah\\git\\actual-EECS2311Group15\\EEC2311_Project_TABTOXML\\src\\main\\java\\tabToXml\\TabFile.txt");
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Converter: Text to MusicXML");
		// keep scene equal or bigger than default in fxml - 800x500
	    primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Home.fxml")),800, 500)); 
		primaryStage.show();
	}
	
//	public static void conversion() {
//		for (int j = 0; j < test.printList().size(); j++) {
//			System.out.print(test.printList().get(0).get(0));
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.print(test.printList());
		//conversion();
		System.out.print("Launching Application");
		launch(args);
	}

  
}
