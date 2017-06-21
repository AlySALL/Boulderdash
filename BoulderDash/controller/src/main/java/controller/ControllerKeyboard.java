package controller;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import model.*;


public class ControllerKeyboard {
	private static final String KEY_UP = null;
	private static final String KEY_DOWN = null;
	private static final String KEY_LEFT = null;
	private static final String KEY_RIGHT = null;
	private Map<Integer, Boolean> keys;
	private Level level;


	public ControllerKeyboard(Level level)
	{
		this.level = level;
		keys = new HashMap<>();
		keys.put(KeyEvent.VK_RIGHT, false);
		keys.put(KeyEvent.VK_LEFT, false);
		keys.put(KeyEvent.VK_UP, false);
		keys.put(KeyEvent.VK_DOWN, false);

	}
	public void keyTyped(KeyEvent e)
	{

	}



	public void KeyPressed (KeyEvent e) {
		Player player;

		switch (event.KeyPressed) {
		case KEY_UP:
			this.player.y_step=-1; //on se déplace vers le haut
			break;
		case KEY_DOWN:
			player.y_step=+1; //on se déplace vers le bas
			break;
		case KEY_LEFT:
			player.x_step=-1; //on se déplace vers la gauche
			break;
		case KEY_RIGHT:
			player.x_step=+1; //on se déplace vers la droite
			break;
		}
	}



	private void right() {
		// TODO Auto-generated method stub
		ControllerKeyboard r =new ControllerKeyboard(level);
		System.out.println();
	}
	private void down() {
		// TODO Auto-generated method stub
		ControllerKeyboard d =new ControllerKeyboard(level);
		System.out.println();
	}
	private void left() {
		// TODO Auto-generated method stub
		ControllerKeyboard l =new ControllerKeyboard(level);
		System.out.println();
	}
	private void up() {
		// TODO Auto-generated method stub
		ControllerKeyboard u =new ControllerKeyboard(level);
		System.out.println();
	}



}


