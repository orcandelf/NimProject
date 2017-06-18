/**
 * 
 */

package westga.cs6910.nim.model.strategy;

import edu.westga.cs6910.nim.model.Pile;

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
	 * @param aPile the Pile to take from
	 * @return the pile
	 * @require pileForThisTurn() != null && pileForThisTurn().sticksLeft() > 0 && pileForThisTurn().sticksLeft() <= pileForThisTurn()
	 * @ensure  pileForThisTurn().sticksLeft() == 
	 * 					pileForThisTurn().sticksLeft()@prev - sticksOnThisTurn()
	 * Precondition: pileSize > 0
	 * Precondition: pileSize is an Integer
	 * 
	 */
	void howManySticks(Pile aPile);
	
}
