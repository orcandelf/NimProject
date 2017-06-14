package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;

/**
 * Class to test Constructor for HumanPlayer class
 * 
 * @author Diane Ela
 * @version Jun 13, 2017
 *
 */
public class HumanPlayerWhenCreatingHuman {

	/**
	 * Tests name of human player
	 */
	@Test
	public void testHumanPlayerName() {
		HumanPlayer human = new HumanPlayer("Missy");
		assertEquals(human.getName(), "Missy");
	}
	
	/**
	 * Tests default number of sticks for human player (0)
	 */
	@Test
	public void testHumanPlayerDefaultSticks() {
		HumanPlayer human = new HumanPlayer("Missy");
		assertEquals(human.getSticksToTake(), 0);
	}
	
	/**
	 * Tests 3 sticks for human player
	 */
	@Test
	public void testHumanPlayer3Sticks() {
		HumanPlayer human = new HumanPlayer("Missy");
		human.setNumberSticksToTake(3);
		assertEquals(human.getSticksToTake(), 3);
	}

}
