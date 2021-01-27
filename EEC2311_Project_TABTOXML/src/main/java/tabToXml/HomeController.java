package tabToXml;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

public class HomeController {

	public HomeController() {}
	
	@FXML
	private Button selectButton, convertButton;
	@FXML
	private Label filePathLabel;
	
	/**
	 * Method for action event of file chooser button being clicked
	 * @param event
	 * @throws IOException
	 */
	public void fileChooser (ActionEvent event) throws IOException{
		FileChooser fc = new FileChooser();
		File selectedFile = fc.showOpenDialog(null);
		
		if (selectedFile != null) {
			filePathLabel.setText(selectedFile.getAbsolutePath());
		}else {
			filePathLabel.setText("No file selected");
		}
		
		//----------------
		//Perhaps have this method show the file in the text field
		//that would eliminate the duplicate needs of converting a shown file vs converting something in the test field
		
	}
	/**
	 * Method for action event of the convert button being clicked
	 * @param event
	 */
	public void converter(ActionEvent event) {
		System.out.println("convert");
	}
	
}
