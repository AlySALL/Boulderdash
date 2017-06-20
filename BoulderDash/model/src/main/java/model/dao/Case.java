package model.dao;


public abstract class Case {

	private int x, y;
	private boolean vide;
	/**
	 * 
	 * @param x
	 * @param y
	 */

	public Case(int x, int y){
		this.setX(x);
		this.setY(y);
	}


	public Case(int x, int y, boolean vide){
		this.setX(x);
		this.setY(y);
		this.setVide(vide);

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


	public boolean isVide() {
		return vide;
	}


	public void setVide(boolean vide) {
		this.vide = vide;
	}
	public void setXY(int x ,int y){
		this.x=x;
		this.y=y;
	}
}
