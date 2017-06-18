/**
 * 
 */

package edu.westga.cs6910.nim.model.strategy;

/** 
 * Defines the number of sticks the computer player will take on it's turn depending
 * on the type of computer player chosen
 * 
 * @author Diane Ela
 * @version Jun 17, 2017
 *
 */
public interface NumberOfSticksStrategy {
	
	/**
	 * Sets the number of sticks the computer player will take on this turn
	 * 
	 * @param pileSize the size of the current pile
	 * @return the number of stocks
	 * @require pileForThisTurn() != null && pileForThisTurn().sticksLeft() > 0 && pileForThisTurn().sticksLeft() <= pileForThisTurn()
	 * @ensure  pileForThisTurn().sticksLeft() == 
	 * 					pileForThisTurn().sticksLeft()@prev - sticksOnThisTurn()
	 * Precondition: pileSize > 0
	 * Precondition: pileSize is an Integer
	 * 
	 */
	int howManySticks(int pileSize);
	
}
