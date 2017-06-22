package model.dao;

import model.Animation.Animation;

public abstract class Case {

	private int x, y;
	private boolean casenull;
	/**
	 * 
	 * @param x
	 * @param y
	 */

	public Case(int x, int y){
		this(x, y, false);
	}


	public Case(int x, int y, boolean casenull){
		this.x=x;
		this.y=y;
		this.casenull=casenull;

	}
	@SuppressWarnings("static-method")
	public String toString(){
		return "C";
	}

	public abstract Animation getAnimation();



	public boolean isCasenull() {
		return casenull;
	}

	public boolean isSuperior(Case C) {
		return getY() > C.getY();
	}

	public StateObjectFall FalledCome(Level L) {
		return StateObjectFall.stable;
	}

	public boolean PlayerCome(Level L) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean EnemiesCome(Level L) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public void refresh(Level L) {
	}

	public void refreshAnim() {
	}

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}



	public void setCasenull(boolean casenull) {
		this.casenull = casenull;
	}
	public void setXY(int x ,int y){
		this.x=x;
		this.y=y;
	}


	public Directions getMove() {
		// TODO Auto-generated method stub
		return null;
	}



}
