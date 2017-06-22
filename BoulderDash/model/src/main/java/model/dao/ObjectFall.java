package model.dao;

public abstract class ObjectFall extends Case {
	
	private static StateObjectFall Stable;
	private StateObjectFall state;
//	private StaeObjectFall instable;
	/**
	 * 
	 * @param x
	 * @param y
	 */


	public ObjectFall(int x, int y) {
		super(x, y);
		setState(ObjectFall.Stable);
	}
	public StateObjectFall getState() {
		return state;
	}
	public void setState(StateObjectFall state) {
		this.state = state;
	}
	
	public void setFall() {
		state = StateObjectFall.fall;
	}

	public boolean fall() {
		return state.equals( StateObjectFall.fall);
	}

	public void setUnstable() {
		state = StateObjectFall.unstable;
	}

	
	public void setStable() {
		state = StateObjectFall.stable;
	}

	public boolean stable() {
		return state.equals(StateObjectFall.stable);
	}
	@Override
	public StateObjectFall FalledCome(Level L) {
		if ((L.getCase(getX() + 1, getY() - 1).isCasenull()) && (L.getCase(getX() + 1, getY()).isCasenull())) {
			if (((ObjectFall) L.getCase(getX(), getY() - 1)).stable()) {
				L.changeCases(getX() + 1, getY(), getX(), getY() - 1);
				L.fillUpTable(getX(), getY() - 1);
				return StateObjectFall.fall;
			} else {
				return StateObjectFall.unstable;
			}
		} else if (L.getCase(getX() - 1, getY()).isCasenull() && L.getCase(getX() - 1, getY() - 1).isCasenull()) {
			if (((ObjectFall) L.getCase(getX(), getY() - 1)).isCasenull()) {
				L.changeCases(getX(), getY() - 1, getX() - 1, getY());
				L.fillUpTable(getX(), getY() - 1);
				return StateObjectFall.fall;
			} else {
				return StateObjectFall.stable;
			}
		} else {
			return StateObjectFall.stable;
		}
	}
	public boolean instable() {
		// TODO Auto-generated method stub
		return false;
	}

}
