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

	/**
	 *  RandomStrategy returns a number of sticks from 1 to the MAX_STICKS_PER_TURN, inclusive
	 * 
	 * @return sticksToTake Returns the number of sticks to take
	 */
	@Override
	public int howManySticks(int pileSize) {
		int sticksToTake = 0;
		if (pileSize > 0) {
			double min = Math.ceil(1.0);
			double max = Math.floor(Game.MAX_STICKS_PER_TURN);
			sticksToTake = (int) Math.ceil((Math.random() * (max - min + 1)));
		}
		return sticksToTake;
	}

}
