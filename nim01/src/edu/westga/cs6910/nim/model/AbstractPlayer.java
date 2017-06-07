package edu.westga.cs6910.nim.model;

/**
 * Superclass for Human and Computer players
 * 
 * @author Diane Ela
 * @version Jun 6, 2017
 */

public class AbstractPlayer {

	private String name;
	private int sticksToTake;
	private Pile thePile;

	/**
	 * Declares the superclass
	 */
	public AbstractPlayer() {
		super();
	}

	/**
	 * Takes the player's turn
	 */
	public void takeTurn() {				
		this.thePile.removeSticks(this.getSticksToTake());
	}

	/**
	 * Sets the count of items in the pile
	 * 
	 * @param aPile the pile
	 */
	public void setPileForThisTurn(Pile aPile) {
		this.thePile = aPile;
	}

	/**
	 * Sets the number of sticks taken
	 * 
	 * @param number the number of sticks
	 */
	public void setNumberSticksToTake(int number) {
		this.setSticksToTake(number);
	}

	/**
	 * Sets default value of sticks to take to 1
	 */
	public void setNumberSticksToTake() {
		this.setSticksToTake(1);
	}

	/**
	 * Gets the player's name
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the number of sticks to return
	 * 
	 * @return returns the number of sticks
	 */
	public int getSticksOnThisTurn() {
		return this.getSticksToTake();
	}

	/**
	 * Gets the number of sticks in the pile
	 * 
	 * @return number of sticks
	 */
	
	public Pile getPileForThisTurn() {
		return this.thePile;
	}

	/** Sets the name of the player
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Returns the sticks to take
	 * 
	 * @return the sticksToTake
	 */
	public int getSticksToTake() {
		return this.sticksToTake;
	}

	/** Sets the sticks to take
	 * @param sticksToTake the sticksToTake to set
	 */
	public void setSticksToTake(int sticksToTake) {
		this.sticksToTake = sticksToTake;
	}

}