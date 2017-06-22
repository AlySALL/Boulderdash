package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public class Mud extends Case {
	/**
	 * 
	 * @param x
	 * @param y
	 */

	public Mud(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



@Override
public Animation getAnimation() {
	return TableAnimation.getWall();
}

@Override
public String toString() {
	return "B";
}

@Override
public boolean PlayerCome(Level L) {
	L.changeCases(L.getProckford().getX(), L.getProckford().getY(), this.getX(),
			this.getY());
	L.insereCaseNull(getX(), getY());
	L.fillUpTable(this.getX(), this.getY());
	return true;
}

}