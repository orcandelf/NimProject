package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

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
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);
		assertEquals(computer.getName(), "Simple computer");
	}
	
	/**
	 * Tests default number of sticks for computer player (0)
	 */
	@Test
	public void testComputerPlayerDefaultSticks() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);
		assertEquals(computer.getSticksToTake(), 0);
	}
	
	/**
	 * Tests number of sticks for computer player to take
	 */
	@Test
	public void testComputerPlayerDefaultSticksToTake() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);
		computer.setNumberSticksToTake();
		assertEquals(computer.getSticksToTake(), 1);
	}

}
