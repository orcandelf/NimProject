package edu.westga.cs6910.nim.view;

import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.AbstractPlayer;
//import edu.westga.cs6910.nim.view.HumanPane.TakeTurnListener;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 * Defines the panel that lets the user tell the computer player to
 * take its turn and that displays the number of sticks the computer
 * player took on its turn.
 * This class was started by CS6910
 * 
 * @author Diane Ela
 * @version Jun 5, 2017
 * 
 */
public class ComputerPane extends GridPane implements InvalidationListener {
	private Game theGame;
	private Label lblNumberTaken;
	private AbstractPlayer theComputer;
	private Button btnTakeTurn;

	/**
	 * Creates a new ComputerPane that observes the specified game. 
	 * 
	 * @param theGame	the model object from which this pane gets its data
	 * 
	 * @requires 	theGame != null
	 */
	public ComputerPane(Game theGame) {
		this.theGame = theGame;
		
		// TODO: !Add this object as an listener of the Game.
		this.theGame.addListener(this);
		
		this.theComputer = this.theGame.getComputerPlayer();
		
		this.buildPane();
	}
	
	private void buildPane() {
		// TODO: !Using the other pane classes as a model, build this pane.
		
		// Pane for the computer
		this.add(new Label("~~ " + this.theComputer.getName() + " ~~"), 0, 0);
		
		this.add(new Label("Number of sticks taken: "), 0, 1);
		
		this.lblNumberTaken = new Label(Integer.toString(this.theComputer.getSticksOnThisTurn()));
		this.add(this.lblNumberTaken, 1, 1);

		this.btnTakeTurn = new Button("Take Turn");
		this.btnTakeTurn.setOnAction(new TakeTurnListener());
		this.add(this.btnTakeTurn, 0, 2);
		this.setDisable(true);
	}

	@Override
	public void invalidated(Observable arg0) {
		if (this.theGame.isGameOver()) {
			this.setDisable(true);
			return;
		}
		
		boolean myTurn = this.theGame.getCurrentPlayer() == theComputer;
		
		if (!myTurn) {
			// TODO: !Set the user interface to show the number of
			// sticks taken by the computer player.
			
			//Updates the computer pane label with the number of sticks taken
			this.lblNumberTaken = new Label(Integer.toString(this.theComputer.getSticksOnThisTurn()));

		} 
		// TODO: !Disable if it is no longer the computer's turn, enable it if
		// it is the computer's turn
		
		//Disables the computer pane if it is the human's turn
		if (this.theGame.getCurrentPlayer() == theComputer) {
			this.setDisable(false);
		} else {
			this.setDisable(true);
		}
	}

	/* 
	 * Defines the listener for takeTurnButton.
	 */
	private class TakeTurnListener implements EventHandler<ActionEvent> {

		/* 
		 * Tells the Game to have its current player (i.e., the computer player)
		 * take its turn.	
		 * 
		 * @see javafx.event.EventHandler#handle(T-extends-javafx.event.Event)
		 */
		@Override
		public void handle(ActionEvent arg0) {
			// TODO: !if the game isn't finished: 
			// 		 - Set the computer's pile and number of sticks.
			//		 - Tell theGame to play a move.
			
			//Sets the computer's pile count and the number of sticks the computer takes and plays a move
			if (!ComputerPane.this.theGame.isGameOver()) {
				ComputerPane.this.theComputer.setPileForThisTurn(ComputerPane.this.theGame.getPile());
				ComputerPane.this.theComputer.setNumberSticksToTake();
				ComputerPane.this.lblNumberTaken.setText(Integer.toString(ComputerPane.this.theComputer.getSticksOnThisTurn()));
				ComputerPane.this.theGame.play();
			}
		}
	}
}
