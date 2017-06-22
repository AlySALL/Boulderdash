package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public class Rock extends Case {

	public Rock(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean PlayerCome(Level L) {
		if (L.getProckford().getMove() == Directions.Left) {
			if (L.getCase(getX() - 1, getY()).isCasenull()) {
				L.changeCases(getX(), getY(), getX() - 1, getY());
				L.fillUpTable(getX(), getY());
				L.fillUpTable(getX() + 1, getY());
			}
		} else if (L.getProckford().getMove().equals( Directions.Right)) {
			if (L.getCase(getX() + 1, getY()).isCasenull()) {
				L.changeCases(getX(), getY(), getX() + 1, getY());
				L.fillUpTable(getX(), getY());
				L.fillUpTable(getX() - 1, getY());
			}
		}
		return false;
	}

	@Override
	public Animation getAnimation() {
		return TableAnimation.getRock();
	}
}
