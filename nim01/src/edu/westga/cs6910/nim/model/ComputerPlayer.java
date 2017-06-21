package edu.westga.cs6910.nim.model;

import edu.westga.cs6910.nim.model.strategy.*;

// TODO: Classes ComputerPlayer and HumanPlayer share most of their code.
//		 Refactor their code:
// 		 1. Create abstract base class AbstractPlayer to implement the
//			shared code and define abstract methods for methods without
//			duplicate code. AbstractPlayer should implement interface Player.
//		 2. Have ComputerPlayer and HumanPlayer extend AbstractPlayer to
//		    implement the unshared constructor code and the abstract methods.

/**
 * ComputerPlayer represents a very simple automated player in the game Nim.
 * It removes 1 stick at a time.
 * This class was started by CS6910
 * 
 * @author Diane Ela
 * @version Jun 6, 2017
 * 
 */
public class ComputerPlayer extends AbstractPlayer implements Player {
	private static final String NAME = "Simple computer";
	private NumberOfSticksStrategy theStrategy;
	
	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 */
	
	public ComputerPlayer() {
		this.setName(NAME);
		this.setSticksToTake(0);
	}
	
	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * @param strategy the strategy for the game
	 * 
	 */
	public ComputerPlayer(NumberOfSticksStrategy strategy) {
		if (strategy.equals(null)) {
			throw new IllegalArgumentException("Strategy is null.");
		} else {
			this.setTheStrategy(strategy);
		}
		this.setName(NAME);
		this.setSticksToTake(0);
	}

	/**
	 * Gets the number of sticks
	 * 
	 * @return this.theSticks returns number of sticks
	 */
	public NumberOfSticksStrategy getTheStrategy() {
		return this.theStrategy;
	}

	/**
	 * Sets the number of sticks
	 * 
	 * @param strategy the number of sticks
	 */
	public void setTheStrategy(NumberOfSticksStrategy strategy) {
		this.theStrategy = strategy;
	}
	
	/**
	 * Determines the number of sticks to take based on the strategy chosen
	 * 
	 * Postcondition: sticksOnThisTurn() >= 1 && sticksOnThisTurn() <=
	 *										Math.min(pileForThisTurn.sticksLeft()-1,
	 *										Game.MAX_STICKS_PER_TURN
	 */
	public void setNumberOfSticksToTake(Pile thePile) {
		this.theStrategy.howManySticks(thePile.getSticksLeft());
	}
	
	/**
	 * Method to determine how many sticks to take based on strategy
	 * 
	 * @param strategy The computer game strategy
	 * 
	 * Precondition: strategy is not null
	 * Postcondition: strategy determines number of sticks to take
	 */
	public void setStrategy(NumberOfSticksStrategy strategy) {
		this.setTheStrategy(strategy);
	}
}
