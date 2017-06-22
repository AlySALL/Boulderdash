package model.dao;

import model.Animation.Animation;
import model.Animation.TableAnimation;

public  class ShieldedWall extends Case {

	public ShieldedWall(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Animation getAnimation() {
		// TODO Auto-generated method stub
		return TableAnimation.getWall();
	}

	@Override
	public String toString() {
		return "M";
	}


}