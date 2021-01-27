package tabToXml;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

public class HomeController {

	File selectedFile;
	
	public HomeController() {}
	
	@FXML
	private Button selectButton, convertButton;
	@FXML
	private Label filePathLabel, bottomLabel;
	@FXML
	private TextArea tabTextArea;
	
	/**
	 * Method for action event of file chooser button being clicked
	 * @param event
	 * @throws IOException
	 */
	public void fileChooser (ActionEvent event) throws IOException{
		FileChooser fc = new FileChooser();
		selectedFile = fc.showOpenDialog(null);
		
		if (selectedFile != null) {
			filePathLabel.setText("File Path: "+ selectedFile.getAbsolutePath());
		}else {
			filePathLabel.setText("File Path: ");
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
		String filePath = selectedFile.getAbsolutePath();
		int index = filePath.lastIndexOf('.');
		String fileType = filePath.substring(index);
		
		if( fileType.equals(".txt")) {
			bottomLabel.setTextFill(Color.GREEN);
			bottomLabel.setText("File Status: A \".txt\" file, you may convert this");
		}else {
			bottomLabel.setTextFill(Color.RED);
			bottomLabel.setText("File Status: NOT a \".txt\" file, pls select a .txt file");

		}		
	}
	
	/**
	 * Method to read a .txt file and displaying in the field window
	 */
	public void reader() {
		
	}
	
}
