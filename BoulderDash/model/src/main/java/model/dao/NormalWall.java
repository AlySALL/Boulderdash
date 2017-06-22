package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public class NormalWall extends Case {

	public NormalWall(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Animation getAnimation() {
		return TableAnimation.getWall();
	}

	@Override
	public String toString() {
		return "N";
	}

	@Override
	public StateObjectFall FalledCome(Level L) {
		if ((L.getCase(getX() + 1, getY() - 1).isCasenull()) && (L.getCase(getX() + 1, getY()).isCasenull())) {
			if (((ObjectFall) L.getCase(getX(), getY() - 1)).instable()) {
				L.changeCases(getX() + 1, getY(), getX(), getY() - 1);
				L.fillUpTable(getX(), getY() - 1);
				return StateObjectFall.fall;
			} else {
				return StateObjectFall.unstable;
			}
		} else if (L.getCase(getX() - 1, getY()).isCasenull()
				&& L.getCase(getX() - 1, getY() - 1).isCasenull()) {
			if (((ObjectFall) L.getCase(getX(), getY() - 1)).instable()) {
				L.changeCases(getX(), getY() - 1, getX() - 1, getY());
				L.fillUpTable(getX(), getY() - 1);
				return StateObjectFall.fall;
			} else {
				return StateObjectFall.unstable;
			}
		} else {
			return StateObjectFall.stable;
		}
	}
}
