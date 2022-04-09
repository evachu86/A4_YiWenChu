/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: CalculatorController.java
 * Other Files in this Project: 
 * CalculatorController.java
 * FXMLCalculator.fxml
 * Main class: MainCalculator.java
 * 
 * Date: Jul 22, 2021
 * 
 * Description: Main class for the calculator application.
 */
package yiwenchu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The Class MainCalculator.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
public class MainCalculator extends Application{

	/**
	 * Start inherit from Application class.
	 *
	 * @param stage the stage
	 * @throws Exception the exception
	 */
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(
				getClass().getResource("FXMLCalculator.fxml"));
		Scene scene = new Scene(root);
		stage.setResizable(false);
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
