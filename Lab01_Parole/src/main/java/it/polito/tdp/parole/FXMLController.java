package it.polito.tdp.parole;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole parole = new Parole();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancel;
    
    @FXML
    private Label lblWarning;
    
    @FXML
    private TextArea txtTempi;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	String daInserire = this.txtParola.getText();
    	
    /*	if (daInserire.compareTo(null)==0) {
    		this.lblWarning.setText("Inserire una parola");
    		return;
    	}
   	*/
    /*	for (int i = 0; i<daInserire.length(); i++) {
    		if (!Character.isAlphabetic(daInserire.charAt(i)))
    			this.txtResult.appendText("Parola non valida! \n");
    		return;
    	}
    	
    	if (daInserire.compareTo("")==0) {
    		this.txtResult.appendText("Scrivi una parola! \n");
    		return;
    	}
    	*/
    	parole.addParola(daInserire);
    //	System.out.println(parole.toString());
    	this.txtResult.setText(parole.toString());
    	this.txtTempi.appendText(Double.toString(System.nanoTime())+"\n");
    	this.txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	parole.reset();
    	this.txtResult.setText(parole.toString());
    	this.txtTempi.appendText(Double.toString(System.nanoTime())+"\n");
    }
    
    @FXML
    void doCancel(ActionEvent event) {
    		parole.cancella(this.txtResult.getSelectedText());
    		this.txtResult.setText(parole.toString());
    		this.txtTempi.appendText(Long.toString(System.nanoTime())+"\n");
    		return;	
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
