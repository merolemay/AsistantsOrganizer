package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;
import model.AttendansOrganizer;

public class AssistantsGUIController implements Initializable{

    @FXML
    private TextField loadTextField;

    @FXML
    private TextField pTextField;

    @FXML
    private TextField sTextField;
    
    AttendansOrganizer organizer;
    
    /* This method conect uses a FileChoser to load the list of attendents to the event 
    */
    public void fileLoaderOption() {
    	Window w = null;
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	fileChooser.setInitialDirectory(new File(System.getProperty("./data/AsistantsInfo.txt")));
    	 fileChooser.getExtensionFilters().addAll(
    	         new ExtensionFilter("Text Files", "*.txt"));
    	 File selectedFile = fileChooser.showOpenDialog(w );
    	 if (selectedFile != null && selectedFile.canRead()) {
    		 try {
				organizer.loadFile(selectedFile.getName());
			} catch (IOException e) {
			}
    	 }
    	 
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		organizer = new AttendansOrganizer();
	}

}
