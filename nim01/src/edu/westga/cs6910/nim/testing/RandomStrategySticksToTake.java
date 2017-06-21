/**
 * 
 */

package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.strategy.RandomStrategy;

/**
 *Testing scenarios for the RandomStrategy
 * 
 * @author Diane Ela
 * @version Jun 18, 2017
 *
 */
public class RandomStrategySticksToTake {

	/**
	 * Tests RandomStrategy when there are 6 sticks
	 */
	@Test
	public void testHowManySticksWhen6Sticks() {
		RandomStrategy random = new RandomStrategy();
		int sticksToRemove = random.howManySticks(6);
		int sticksLeft =  6 - sticksToRemove;
		assertEquals(6 - sticksToRemove, sticksLeft);
	}
	
	/**
	 * Tests RandomStrategy when there are 3 sticks
	 */
	@Test
	public void testHowManySticksWhen3Sticks() {
		RandomStrategy random = new RandomStrategy();
		int sticksToRemove = random.howManySticks(3);
		int sticksLeft =  3 - sticksToRemove;
		assertEquals(3 - sticksToRemove, sticksLeft);
	}
	
	/**
	 * Tests RandomStrategy when there are 0 sticks
	 */
	@Test
	public void testHowManySticksWhen0Sticks() {
		RandomStrategy random = new RandomStrategy();
		int sticksToRemove = random.howManySticks(0);
		int sticksLeft =  0 - sticksToRemove;
		assertEquals(0 - sticksToRemove, sticksLeft);
	}

}
