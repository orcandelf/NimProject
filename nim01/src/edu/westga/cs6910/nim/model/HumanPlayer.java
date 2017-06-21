package edu.westga.cs6910.nim.model;

/**
 * HumanPlayer represents a human player in the game Nim.
 * 
 * @author CS 6910
 * @version Summer 2017
 * 
 * @author Diane Ela
 * @version Jun 6, 2017
 */
public class HumanPlayer extends AbstractPlayer implements Player {
	/**
	 * Creates a new Human with the specified name.
	 * 
	 * @param name
	 *            this Player's name
	 * 
	 * @requires name != null
	 * @ensure name().equals(name) && sticksRemoved() == 0
	 */
	public HumanPlayer(String name) {
		this.setName(name);
		this.setNumberSticksToTake(0);
	}
}