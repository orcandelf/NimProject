/**
 * 
 */

package edu.westga.cs6910.nim.model.strategy;

import edu.westga.cs6910.nim.model.Game;

/**
 *Class for the cautious strategy where computer takes 1 stick only
 * 
 * @author Diane Ela
 * @version Jun 18, 2017
 *
 */
public class GreedyStrategy implements NumberOfSticksStrategy {

	/**
	 * Returns 1 stick to take always
	 */
	@Override
	public int howManySticks(int pileSize) {
		int sticksToTake = 0;
		if (pileSize > 0) {
			sticksToTake = Math.min(pileSize - 1, Game.MAX_STICKS_PER_TURN);
		}
		return sticksToTake;
	}
}
