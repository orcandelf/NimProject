/**
 * 
 */

package edu.westga.cs6910.nim.model.strategy;

import edu.westga.cs6910.nim.model.Game;

/**Random strategy for the computer
 * 
 * @author Diane Ela
 * @version Jun 18, 2017
 *
 */
public class RandomStrategy implements NumberOfSticksStrategy {

	/* (non-Javadoc)
	 * @see edu.westga.cs6910.nim.model.strategy.NumberOfSticksStrategy#howManySticks(int)
	 */
	@Override
	public int howManySticks(int pileSize) {
		int sticksToTake = 0;
		if (pileSize > 0) {
			int min = 1;
			int max = Math.min(pileSize - 1, Game.MAX_STICKS_PER_TURN);
			sticksToTake = (int) (min + (Math.random() * (max - min)));
		}
		return sticksToTake;
	}

}
