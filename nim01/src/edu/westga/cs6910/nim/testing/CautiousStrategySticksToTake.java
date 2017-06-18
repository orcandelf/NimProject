/**
 * 
 */
package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import westga.cs6910.nim.model.strategy.CautiousStrategy;

/**
 * @author Diane Ela
 * @version Jun 18, 2017
 *
 */
public class CautiousStrategySticksToTake {

	/**
	 * Test method for {@link westga.cs6910.nim.model.strategy.CautiousStrategy#howManySticks(int)}.
	 */
	@Test
	public void testHowManySticksWhen6Sticks() {
		CautiousStrategy cautious = new CautiousStrategy();
		int sticksLeft =  6 - cautious.howManySticks(6);
		assertEquals(5, sticksLeft);
	}
	
	/**
	 * Test method for {@link westga.cs6910.nim.model.strategy.CautiousStrategy#howManySticks(int)}.
	 */
	@Test
	public void testHowManySticksWhen3Sticks() {
		CautiousStrategy cautious = new CautiousStrategy();
		int sticksLeft =  3 - cautious.howManySticks(3);
		assertEquals(2, sticksLeft);
	}
	
	/**
	 * Test method for {@link westga.cs6910.nim.model.strategy.CautiousStrategy#howManySticks(int)}.
	 */
	@Test
	public void testHowManySticksWhen0Sticks() {
		CautiousStrategy cautious = new CautiousStrategy();
		int sticksLeft =  0 - cautious.howManySticks(0);
		assertEquals(0, sticksLeft);
	}

}
