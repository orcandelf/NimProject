package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Player;

import org.junit.Test;

/** Class to test the startNewGame method in the Game class
 * 
 * @author Diane Ela
 * @version Jun 13, 2017
 *
 */
public class GameWhenStartingNewGame {

	/**
	 * Tests starting a new game with a human player
	 */
	@Test
	public void testStartNewGameWithHuman() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		final Player theHuman = (Player) newGame.getHumanPlayer();
		newGame.startNewGame(theHuman);
		assertEquals(newGame.getCurrentPlayer().getName() + "," + newGame.toString(), "Human, Pile size: 7");
	}
	
	/**
	 * Tests starting a new game with a computer player
	 */
	@Test
	public void testStartNewGameWithComputer() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		final Player theComputer = (Player) newGame.getComputerPlayer();
		newGame.startNewGame(theComputer);
		assertEquals(newGame.getCurrentPlayer().getName() + "," + newGame.toString(), "Simple computer, Pile size: 7");
	}

}
