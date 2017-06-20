package model.dao;

public abstract class ObjectFall extends Case {
	
	private static StateObjectFall Stable;
	private StateObjectFall state;
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

}
