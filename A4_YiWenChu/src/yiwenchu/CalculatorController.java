/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: CalculatorController.java
 * Other Files in this Project: 
 * FXMLCalculator.fxml
 * Main class: MainClaculator.java
 * 
 * Date: Jul 22, 2021
 * 
 * Description: The controller for the calculator application.
 */
package yiwenchu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * The Class CalculatorController.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
public class CalculatorController implements Initializable {
	
	@FXML
	private TextField xInput,yInput;
	
	@FXML
	private Label resOutput;
	
	@FXML
	private Button clearXBtn,clearYBtn,clearXYBtn,
		powBtn, maxBtn,minBtn,evenOddBtn,exitBtn;
	
	@FXML
	private ImageView imgMain;
	
	// for swapping image.
	private Image img = new Image(getClass()
			.getResource("res/cat-948224_1280.jpg").toExternalForm());
	
	@FXML
	private void clear(ActionEvent event) {
		
		if(event.getSource() == clearXBtn) {
			xInput.setText(String.valueOf(0));
			resOutput.setText("X is cleared.");
		} else if(event.getSource() == clearYBtn) {
			yInput.setText(String.valueOf(0));
			resOutput.setText("Y is cleared.");
		} else if(event.getSource() == clearXYBtn) {
			xInput.setText(String.valueOf(0));
			yInput.setText(String.valueOf(0));
			resOutput.setText("Both X and Y are cleared.");
		}
	}
	
	@FXML
	private void swap(MouseEvent event) {
		
		Image tempImg = imgMain.getImage();
		imgMain.setImage(img);
		img = tempImg;
	}
	
	/**
	 * Initialize the function button of
	 * X ^ Y, Max, Min, Even or Odd, Exit.
	 *
	 * @param location the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// Function for the button of "X ^ Y"
		powBtn.setOnAction(event -> {
			double res = Math.pow(Double.parseDouble(xInput.getText()),
							 Double.parseDouble(yInput.getText()));
			resOutput.setText(String.format("%.2f", res));
		});
		
		// Function for the button of "Max"
		maxBtn.setOnAction(event -> {
			double res = Math.max(Double.parseDouble(xInput.getText()),
							 Double.parseDouble(yInput.getText()));
			resOutput.setText(String.format("%.2f", res));
		});
		
		// Function for the button of "Min"
		minBtn.setOnAction(event -> {
			double res = Math.min(Double.parseDouble(xInput.getText()),
							 Double.parseDouble(yInput.getText()));
			resOutput.setText(String.format("%.2f", res));
		});
		
		// Function for the button of "Even or Odd"
		evenOddBtn.setOnAction(event -> {
			System.out.println(evenOddMsg(Integer.parseInt(xInput.getText())));
			
			resOutput.setText( evenOddMsg(Integer.parseInt(xInput.getText()))
					+" and "+ evenOddMsg(Integer.parseInt(yInput.getText())) );
		});
		
		// Function for the button of "Exit"
		exitBtn.setOnAction(event -> {
			System.exit(0);
		});
	}

	// show message even or odd message according input number.   
	private String evenOddMsg(int input) {
		return (input %2 == 0)?
				String.format("%.2f", (double)input) + " is even":
					String.format("%.2f", (double)input) + " is odd";
	}
}
