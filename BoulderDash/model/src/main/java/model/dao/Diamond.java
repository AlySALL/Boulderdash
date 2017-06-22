package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public class Diamond extends ObjectFall{
	/**
	 * 
	 * @param x
	 * @param y
	 */

	public Diamond(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "D";
	}

	@Override
	public boolean PlayerCome(Level L) {
		L.changeCases(L.getProckford().getX(), L.getProckford().getY(), getX(), getY());
		L.insereCaseNull(getX(), getY());
		L.fillUpTable(L.getProckford().getX(), L.getProckford().getY());
		L.AddDscore();
		L.addToScore(25);
		L.fillUptable(this);
		return true;
	}

	@Override
	public Animation getAnimation() {
		return TableAnimation.getDiamond();
	}

}


