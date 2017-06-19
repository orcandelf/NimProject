/**
 * 
 */

package edu.westga.cs6910.nim.view;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;

/** New Pane for the Menu Bar
 * 
 * @author Diane Ela
 * @version Jun 17, 2017
 *
 */
public class MenuPane extends GridPane {

	
	/**
	 * Builds the menuPane
	 */
	public MenuPane() {	
		this.buildPane();
	}
	
	private void buildPane() {
		this.add(this.mBar(), 0, 0);
	}
	
	private MenuBar mBar() {
		MenuBar mBar = new MenuBar();
		mBar.getMenus().add(this.fileMenu());
		mBar.getMenus().add(this.strategyMenu());
		return mBar;
	}
	
	private Menu fileMenu() {
		Menu fileMenu = new Menu("_File");
		MenuItem exit = new MenuItem("E_xit");
		exit.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
		exit.setOnAction(new ExitProgram());
		fileMenu.getItems().add(exit);
		return fileMenu;
	}
	
	private Menu strategyMenu() {
		Menu strategyMenu = new Menu("_Strategy");
		MenuItem cautious = new MenuItem("_Cautious");
		cautious.setOnAction(new CautiousGame());
		MenuItem greedy = new MenuItem("_Greedy");
		MenuItem random = new MenuItem("_Random");
		strategyMenu.getItems().add(cautious);
		strategyMenu.getItems().add(greedy);
		strategyMenu.getItems().add(random);
		return strategyMenu;
	}
	
	private class ExitProgram implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			System.exit(0);
		}
	}
	
	private class CautiousGame implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			CautiousStrategy cautious = new CautiousStrategy();
			ComputerPlayer computer = new ComputerPlayer();
			computer.setStrategy(cautious);
		}
	}
}
