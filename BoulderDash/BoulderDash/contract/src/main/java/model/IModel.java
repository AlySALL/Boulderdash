package model;

import java.util.logging.Level;

/**
 * 
 * @author ALY
 *
 */
public interface IModel {

	Level getLevel();

	Level getLevel(String string);
	
	public int[][] getTable();
	void up();
	void left();
	void down();
	void right();
	int[][] getLeveL ( int resultTable[][]);
}
