package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;
import edu.westga.cs6910.nim.model.Player;

/** Test class to test the play method in the Game class
 * 
 * @author Diane Ela
 * @version Jun 13, 2017
 *
 */
public class GameWhenPlayingGame {

	/**
	 * Tests playing a game with a computer player as first player
	 */
	@Test
	public void testPlayGameWithComputerFirst() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		final Player theComputer = (Player) newGame.getComputerPlayer();
		Pile newPile = new Pile(7);
		newGame.startNewGame(theComputer);
		theComputer.setPileForThisTurn(newPile);
		theComputer.setNumberSticksToTake();
		newGame.play();
		newGame.getCurrentPlayer().setPileForThisTurn(newPile);
		assertEquals(newGame.getCurrentPlayer().getName() + ", " + newGame.getCurrentPlayer().getPileForThisTurn(), "Human, Pile size: 6");
	}
	
	 /**
	 * Tests playing a game with a human player as first player
	 */
	@Test
	public void testPlayGameWithHumanFirst() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		final Player theHuman = (Player) newGame.getHumanPlayer();
		Pile newPile = new Pile(7);
		newGame.startNewGame(theHuman);
		theHuman.setPileForThisTurn(newPile);
		theHuman.setNumberSticksToTake(3);
		newGame.play();
		newGame.getCurrentPlayer().setPileForThisTurn(newPile);
		assertEquals(newGame.getCurrentPlayer().getName() + ", " + newGame.getCurrentPlayer().getPileForThisTurn(), "Simple computer, Pile size: 4");
	}

}
