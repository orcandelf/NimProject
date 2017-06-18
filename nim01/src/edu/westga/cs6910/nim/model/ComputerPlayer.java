package edu.westga.cs6910.nim.model;

import edu.westga.cs6910.nim.

// TODO: Classes ComputerPlayer and HumanPlayer share most of their code.
//		 Refactor their code:
// 		 1. Create abstract base class AbstractPlayer to implement the
//			shared code and define abstract methods for methods without
//			duplicate code. AbstractPlayer should implement interface Player.
//		 2. Have ComputerPlayer and HumanPlayer extend AbstractPlayer to
//		    implement the unshared constructor code and the abstract methods.

/**
 * ComputerPlayer represents a very simple automated player in the game Nim.
 * It removes 1 stick at a time.
 * This class was started by CS6910
 * 
 * @author Diane Ela
 * @version Jun 6, 2017
 * 
 */
public class ComputerPlayer extends AbstractPlayer implements Player {
	private static final String NAME = "Simple computer";
	private static final NumberOfSticksStragegy theSticks;
	
	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 */
	public ComputerPlayer() {
		this.setName(NAME);
		this.setSticksToTake(0);
	}
}
