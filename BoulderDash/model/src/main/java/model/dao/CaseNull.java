package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public class CaseNull extends Case{

	public CaseNull(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Animation getAnimation() {
		return TableAnimation.getCaseNull();
	}

	@Override
	public String toString() {
		return "V";
	}

	@Override
	public boolean PlayerCome(Level L) {
		L.changeCases(L.getProckford().getX(), L.getProckford().getY(), getX(), getY());
		L.fillUpTable(getX(), getY());
		return true;

	}

	@Override
	public StateObjectFall FalledCome(Level L) {
		if (((ObjectFall) L.getCase(getX(), getY() - 1)).stable()) {
			L.changeCases(getX(), getY(), getX(), getY() - 1);
			L.fillUpTable(getX(), getY());
			return StateObjectFall.fall;
		} else {
			return StateObjectFall.stable;
		}
	}

	@Override
	public boolean EnemiesCome(Level L) {
		return true;
	}

}
