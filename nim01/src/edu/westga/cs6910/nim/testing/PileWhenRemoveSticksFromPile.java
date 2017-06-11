package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.Pile;

/** Test to verify method removeSticks is working properly
 * 
 * @author Diane Ela
 * @version Jun 11, 2017
 */
public class PileWhenRemoveSticksFromPile {

	/**
	 * Test to remove 2 sticks from a pile of 4
	 * Expected result: Pile size: 2
	 */
	@Test
	public void testRemove2Sticks() {
		Pile fourSticks = new Pile(4);
		fourSticks.removeSticks(2);
		assertEquals("Pile size: 2", fourSticks.toString());
	}
	
	/**
	 * Test to remove 5 sticks from a pile of 10
	 * Expected result: Pile size: 5
	 */
	@Test
	public void testRemove5Sticks() {
		Pile fourSticks = new Pile(10);
		fourSticks.removeSticks(5);
		assertEquals("Pile size: 5", fourSticks.toString());
	}
	
	/**
	 * Test to remove 30 sticks from a pile of 100
	 * Expected result: Pile size: 70
	 */
	@Test
	public void testRemove30Sticks() {
		Pile fourSticks = new Pile(100);
		fourSticks.removeSticks(30);
		assertEquals("Pile size: 70", fourSticks.toString());
	}

}
