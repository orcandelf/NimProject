package edu.westga.cs6910.nim.view;

import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


/**
 * Defines a GUI for the 1-pile Nim game.
 * This class was started by CS6910
 * 
 * @author Diane Ela
 * @version Jun 5, 2017
 * 
 */
public class NimPane extends BorderPane {
	private Game theGame;
	private BorderPane pnContent;
	private BorderPane pnMenu;
	private HumanPane pnHumanPlayer;
	private ComputerPane pnComputerPlayer;
	private StatusPane pnGameInfo;
	private MenuPane pnMenuBar;
	private Pane pnChooseFirstPlayer;
	
	/**
	 * Creates a pane object to provide the view for the specified
	 * Game model object.
	 * 
	 * @param theGame	the domain model object representing the Nim game
	 * 
	 * @requires theGame != null
	 * @ensures	 the pane is displayed properly
	 */
	public NimPane(Game theGame) {
		this.theGame = theGame;
		
		this.pnContent = new BorderPane();
		this.pnMenu = new BorderPane();
		
		this.addFirstPlayerChooserPane(theGame);
		
		// TODO: !1. Using the 'first player chooser pane' as a guide
		//			Create an HBox with the appropriate style, then
		//			make a human player pane and add it to the HBox.
		//			Finally add the HBox to the content pane
		
		//Adds the human player to the pane
		this.addHumanPlayerChooserPane(theGame);
		
		// TODO: !2. Using the other panes as a guide, create
		//			and add a status pane
				
		//Adds the status pane
		this.addStatusPane(theGame);
		
		// TODO: !3. Using the other panes as a guide, create
		//			and add a computer pane
		
		//Adds the computer player to the pane
		this.addComputerPlayerChooserPane(theGame);
		
		this.addMenuBar();
		this.setCenter(this.pnContent);
		this.setTop(this.pnMenu);
	}

	/*
	 * The pane for the human player
	 */
	private void addHumanPlayerChooserPane(Game theGame) {
		HBox leftBox = new HBox();
		leftBox.getStyleClass().add("pane-border");
		this.pnHumanPlayer = new HumanPane(theGame);
		leftBox.getChildren().add(this.pnHumanPlayer);
		this.pnContent.setLeft(leftBox);
	}
	
	/*
	 * The pane for the game status
	 */
	private void addStatusPane(Game theGame) {
		HBox centerBox = new HBox();
		centerBox.getStyleClass().add("pane-border");
		this.pnGameInfo = new StatusPane(theGame);
		centerBox.getChildren().add(this.pnGameInfo);
		this.pnContent.setCenter(centerBox);
	}
	
	/*
	 * The pane for the computer player
	 */	
	private void addComputerPlayerChooserPane(Game theGame) {
		HBox rightBox = new HBox();
		rightBox.getStyleClass().add("pane-border");
		this.pnComputerPlayer = new ComputerPane(theGame);
		rightBox.getChildren().add(this.pnComputerPlayer);
		this.pnContent.setRight(rightBox);
	}
	
	private void addFirstPlayerChooserPane(Game theGame) {
		HBox topBox = new HBox();
		topBox.getStyleClass().add("pane-border");	
		this.pnChooseFirstPlayer = new NewGamePane(theGame);
		topBox.getChildren().add(this.pnChooseFirstPlayer);
		this.pnContent.setTop(topBox);
	}
	
	private void addMenuBar() {
		HBox menuBox = new HBox();
		this.pnMenuBar = new MenuPane();
		menuBox.getChildren().add(this.pnMenuBar);
		this.pnMenu.setLeft(menuBox);
		double menuHeight = menuBox.getHeight();
		this.pnMenu.setMaxHeight(menuHeight);
	}

	/*
	 * Defines the panel in which the user selects which Player plays first.
	 */
	private final class NewGamePane extends GridPane {
		private RadioButton radHumanPlayer;
		private RadioButton radComputerPlayer;
		
		private Game theGame;
		private Player theHuman;
		private Player theComputer;
		
		private NewGamePane(Game theGame) {
			this.theGame = theGame;
			
			this.theHuman = (Player) this.theGame.getHumanPlayer();
			this.theComputer = (Player) this.theGame.getComputerPlayer();
			
			this.buildPane();
		}
		
		private void buildPane() {
			this.setHgap(20);
			
			this.radHumanPlayer = new RadioButton(this.theHuman.getName() + " first");	
			this.radHumanPlayer.setOnAction(new HumanFirstListener());
			
			// TODO: !Instantiate the computer player button and set 
			//		its action listener.
			
			// Instantiates the computer player and sets action listener
			this.radComputerPlayer = new RadioButton(this.theComputer.getName() + " first");
			this.radComputerPlayer.setOnAction(new ComputerFirstListener());
			
			// TODO: !Create a ToggleGroup and add the 2 radio buttons to it.
			
			/*
			 * Adds a toggle group with the two radio buttons to determime the first player
			 */
			ToggleGroup theToggles = new ToggleGroup();
			this.radHumanPlayer.setToggleGroup(theToggles);
			this.radComputerPlayer.setToggleGroup(theToggles);
			
			// TODO: !Add the 2 radio buttons to this pane.
						
			//Adds the radio buttons to the pane
			add(this.radHumanPlayer, 1, 1);
			add(this.radComputerPlayer, 2, 1);

		}
		
		/* 
		 * Defines the listener for computer player first button.
		 */		
		private class ComputerFirstListener implements EventHandler<ActionEvent> {
			@Override
			/** 
			 * Enables the ComputerPlayerPanel and starts a new game. 
			 * Event handler for a click in the computerPlayerButton.
			 */
			public void handle(ActionEvent arg0) {
				NimPane.this.pnComputerPlayer.setDisable(false);
				NimPane.this.pnChooseFirstPlayer.setDisable(true);
				NimPane.this.theGame.startNewGame(NewGamePane.this.theComputer);
			}
		}

		
		/* 
		 * Defines the listener for human player first button.
		 */	
		private class HumanFirstListener implements EventHandler<ActionEvent> {
			/* 
			 * Sets up user interface and starts a new game. 
			 * Event handler for a click in the human player button.
			 */
			@Override
			public void handle(ActionEvent event) {
				NimPane.this.pnChooseFirstPlayer.setDisable(true);
				
				// TODO: !Enable the human player pane and start a game
				//		 with the human playing first.

				//Enables the human player and starts a new game with the human player going first
				NimPane.this.pnHumanPlayer.setDisable(false);
				NimPane.this.theGame.startNewGame(NewGamePane.this.theHuman);
			}
		}
	}
}
