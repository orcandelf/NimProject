package edu.westga.cs6910.nim.controllers;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.view.NimPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Driver for the application. Creates the GUI and shows it.
 * 
 * @author CS6910
 * @version Summer 2017
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("CS6910 - Simple Nim");
		Game theGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());

		NimPane root = new NimPane(theGame);
		Scene scene = new Scene(root, 700, 200);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Entry point into the application
	 * 
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
