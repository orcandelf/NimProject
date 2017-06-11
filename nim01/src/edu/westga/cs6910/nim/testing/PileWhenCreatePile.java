package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.Pile;

/**Test cases for the Pile class
 * 
 * @author Diane Ela
 * @version Jun 11, 2017
 *
 */
public class PileWhenCreatePile {

	/**
	 * Test to verify 1 stick in pile
	 */
	@Test
	public void testShouldProducePileWith1Stick() {
		Pile oneStickPile = new Pile(1);
		assertEquals("Pile size: 1", oneStickPile.toString());
	}

	/**
	 * Test to verify 10 sticks in pile
	 */
	@Test
	public void testShouldProducePileWith10Sticks() {
		Pile tenStickPile = new Pile(10);
		assertEquals("Pile size: 10", tenStickPile.toString());
	}
	
	/**
	 * Test to verify 100 sticks in pile
	 */
	@Test
	public void testShouldProducePileWith100Sticks() {
		Pile oneHundredStickPile = new Pile(100);
		assertEquals("Pile size: 100", oneHundredStickPile.toString());
	}

}
