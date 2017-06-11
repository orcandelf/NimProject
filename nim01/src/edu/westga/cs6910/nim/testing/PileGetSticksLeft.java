package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.Pile;

/** Test for the getSticksLeft method in the Pile class
 * 
 * @author Diane Ela
 * @version Jun 11, 2017
 */
public class PileGetSticksLeft {

	/**
	 * Test to ensure 1 stick is left in the pile
	 */
	@Test
	public void testWith1StickPileShouldHave1StickLeft() {
		Pile oneStickPile = new Pile(1);
		assertEquals(1, oneStickPile.getSticksLeft());
	}
	
	/**
	 * Test to ensure 6 sticks are left in the pile
	 */
	@Test
	public void testWith6SticksPileShouldHave6SticksLeft() {
		Pile sixStickPile = new Pile(6);
		assertEquals(6, sixStickPile.getSticksLeft());
	}
	
	/**
	 * Test to ensure 45 sticks are left in the pile
	 */
	@Test
	public void testWith45SticksPileShouldHave45SticksLeft() {
		Pile fourtyFiveStickPile = new Pile(45);
		assertEquals(45, fourtyFiveStickPile.getSticksLeft());
	}

}
