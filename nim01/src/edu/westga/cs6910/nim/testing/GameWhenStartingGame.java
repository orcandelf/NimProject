package edu.westga.cs6910.nim.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.ComputerPlayer;

public class GameWhenStartingGame {

	@Test
	public void testGameWithHumanNamedHuman() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getHumanPlayer().getName(), "Human");
	}
	
	@Test
	public void testGameWithComputerName() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getComputerPlayer().getName(), "Simple computer");
	}
	
	@Test
	public void testGameStartingPile() {
		Game newGame = new Game(new HumanPlayer("Human"), new ComputerPlayer());
		assertEquals(newGame.getPile().toString(), "Pile size: 7");
	}
}
