/**
 * 
 */

package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.strategy.GreedyStrategy;

/**
 *Testing scenarious for the GreedyStrategy
 * 
 * @author Diane Ela
 * @version Jun 18, 2017
 *
 */
public class GreedyStrategySticksToTake {

	/**
	 * Tests GreedyStrategy when there are 6 sticks
	 */
	@Test
	public void testHowManySticksWhen6Sticks() {
		GreedyStrategy greedy = new GreedyStrategy();
		int sticksLeft =  6 - greedy.howManySticks(6);
		assertEquals(3, sticksLeft);
	}
	
	/**
	 * Tests GreedyStrategy when there are 3 sticks
	 */
	@Test
	public void testHowManySticksWhen3Sticks() {
		GreedyStrategy greedy = new GreedyStrategy();
		int sticksLeft =  3 - greedy.howManySticks(3);
		assertEquals(1, sticksLeft);
	}
	
	/**
	 * Tests GreedyStrategy when there are 0 sticks
	 */
	@Test
	public void testHowManySticksWhen0Sticks() {
		GreedyStrategy greedy = new GreedyStrategy();
		int sticksLeft =  0 - greedy.howManySticks(0);
		assertEquals(0, sticksLeft);
	}

}
