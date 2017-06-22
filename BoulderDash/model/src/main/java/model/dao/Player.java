package model.dao;

import model.Animation.Animation;
import model.Animation.ChoiceAnimation;

public class Player extends Case{
	/**
	 * offset:Allows the Player to move along x and y
	 */
	private int offsetx, offsety;
	public Directions Move, lastDir;
	public ChoiceAnimation animation;
	boolean  playerAlive;
	
	
	public Player(int x, int y) {
		super(x, y);
		/**
		 * TODO
		 */

		this.playerAlive = true;
		this.Move = Directions.Null;
		this.lastDir = Directions.Null;
		
		
		/**
		 * add methods to move the player
		 */
	}

	/**
	 * 
	 * @return
	 */

	public int getOffsetx() {
		return offsetx;
	}


	public void setOffsetx(int offsetx) {
		this.offsetx = offsetx;
	}


	public int getOffsety() {
		return offsety;
	}


	public void setOffsety(int offsety) {
		this.offsety = offsety;
	}

	@Override
	public Animation getAnimation() {
		// TODO Auto-generated method stub
		return null;
	}

}
