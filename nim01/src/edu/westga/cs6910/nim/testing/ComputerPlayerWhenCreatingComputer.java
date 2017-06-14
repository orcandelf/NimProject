package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;

/**
 * Class to test the ComputerPlayer class
 * 
 * @author Diane Ela
 * @version Jun 13, 2017
 *
 */
public class ComputerPlayerWhenCreatingComputer {

	/**
	 * Tests name of computer player
	 */
	@Test
	public void testComputerPlayerName() {
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals(computer.getName(), "Simple computer");
	}
	
	/**
	 * Tests default number of sticks for computer player (0)
	 */
	@Test
	public void testComputerPlayerDefaultSticks() {
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals(computer.getSticksToTake(), 0);
	}
	
	/**
	 * Tests number of sticks for computer player to take
	 */
	@Test
	public void testComputerPlayerDefaultSticksToTake() {
		ComputerPlayer computer = new ComputerPlayer();
		computer.setNumberSticksToTake();
		assertEquals(computer.getSticksToTake(), 1);
	}

}
