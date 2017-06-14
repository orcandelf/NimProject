package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.ComputerPlayer;

/**
 * Test class for the Game class
 * 
 * @author Diane Ela
 * @version Jun 13, 2017
 *
 */
public class GameWhenStartingGame {

	/**
	 * Tests the creation of the human player in the Game constructor
	 */
	@Test
	public void testGameWithHumanNamedHuman() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getHumanPlayer().getName(), "Human");
	}
	
	/**
	 * Tests the creation of the computer player in the Game constructor
	 */
	@Test
	public void testGameWithComputerName() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getComputerPlayer().getName(), "Simple computer");
	}
	
	
	/**
	 * Tests the default number of sticks in the pile when starting a new game
	 */
	@Test
	public void testGameStartingPile() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getPile().toString(), "Pile size: 7");
	}
	
	/**
	 * Tests the number of sticks left when starting a new game
	 */
	@Test
	public void testGameStickLeftStartingPile() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getSticksLeft(), 7);
	}
}
