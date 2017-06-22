package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public class ButterFly extends Case {
	Directions dirNav;
	boolean tempo;

	public ButterFly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		dirNav = Directions.Up;
		tempo = true;
	}

	@Override
	public void refresh(Level L) {
		if (!tempo) {
			switch (dirNav) {
			case Up:
				navUp(L);
				break;
			case Down:
				navDown(L);
				break;
			case Left:
				navLeft(L);
				break;
			case Right:
				navRight(L);
				break;
			default:
				break;
			}
			tempo = true;
		} else {
			tempo = false;
		}
	}
	
	private boolean verifyUp(Level L) {
		return L.getCase(getX(), getY() - 1).EnemiesCome(L);
	}

	private boolean verifyDown(Level L) {
		return L.getCase(getX(), getY() + 1).EnemiesCome(L);
	}

	private boolean verifyLeft(Level L) {
		return L.getCase(getX() - 1, getY()).EnemiesCome(L);
	}

	private boolean verifyRight(Level L) {
		return L.getCase(getX() + 1, getY()).EnemiesCome(L);
	}

	private void moveUp(Level L) {
		L.changeCases(getX(), getY() - 1, getX(), getY());
		dirNav = Directions.Up;
	}

	private void moveDown(Level L) {
		L.changeCases(getX(), getY() + 1, getX(), getY());
		dirNav = Directions.Down;
	}

	private void moveLeft(Level L) {
		L.changeCases(getX(), getY(), getX() - 1, getY());
		dirNav = Directions.Left;
	}

	private void moveRight(Level L) {
		L.changeCases(getX(), getY(), getX() + 1, getY());
		dirNav = Directions.Right;
	}

	private void navUp(Level L) {
		if (verifyLeft(L)) {
			moveLeft(L);
		} else if (verifyUp(L)) {
			moveUp(L);
		} else if (verifyRight(L)) {
			moveRight(L);
		} else {
			dirNav = Directions.Down;
		}
	}

	private void navDown(Level L) {

		if (verifyRight(L)) {
			moveRight(L);
		} else if (verifyDown(L)) {
			moveDown(L);
		} else if (verifyLeft(L)) {
			moveLeft(L);
		} else {
			dirNav = Directions.Up;
		}
	}

	private void navLeft(Level L) {

		if (verifyDown(L)) { moveDown(L);
		} else if (verifyRight(L)) {
			moveLeft(L);
		} else if (verifyUp(L)) {
			moveUp(L);
		} else {
			dirNav = Directions.Right;
		}
	}

	private void navRight(Level L) {
		if (verifyUp(L)) {
			moveUp(L);
				} else if (verifyRight(L)) {
					moveRight(L);
				} 	else if (verifyDown(L)) {
						moveDown(L);
			} else {
			dirNav = Directions.Left;
		}
	}

	@Override
	public Animation getAnimation() {
		// TODO Auto-generated method stub
		return TableAnimation.getButterFly();
	}
	@Override
	public StateObjectFall FalledCome(Level L) {
		if (((ObjectFall) L.getCase(getX(), getY() - 1)).fall()) {
			L.addToScore(100);
			for (int y = getY() - 1; y <= getY() + 1; y++) {
				for (int x = getX() - 1; x <= getX() + 1; x++) {
					L.filUptable(L.getCase(x, y));
					L.insereDiamond(x, y);
				}
			}
		}
		return StateObjectFall.fall;
	}

	@Override
	public String toString() {
		return "E";
	}
}
