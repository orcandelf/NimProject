/**
 * 
 */

package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

/**
 *Testing scenarious for the CautiousStrategy
 * 
 * @author Diane Ela
 * @version Jun 18, 2017
 *
 */
public class CautiousStrategySticksToTake {

	/**
	 * Tests CautiousStrategy when there are 6 sticks
	 */
	@Test
	public void testHowManySticksWhen6Sticks() {
		CautiousStrategy cautious = new CautiousStrategy();
		int sticksLeft =  6 - cautious.howManySticks(6);
		assertEquals(5, sticksLeft);
	}
	
	/**
	 * Tests CautiousStrategy when there are 3 sticks
	 */
	@Test
	public void testHowManySticksWhen3Sticks() {
		CautiousStrategy cautious = new CautiousStrategy();
		int sticksLeft =  3 - cautious.howManySticks(3);
		assertEquals(2, sticksLeft);
	}
	
	/**
	 * Tests CautiousStrategy when there are 0 sticks
	 */
	@Test
	public void testHowManySticksWhen0Sticks() {
		CautiousStrategy cautious = new CautiousStrategy();
		int sticksLeft =  0 - cautious.howManySticks(0);
		assertEquals(0, sticksLeft);
	}

}
