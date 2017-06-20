package controller;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class ControllerKeyboard {
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
	
	public void keyPressed(KeyEvent e)
	{
		switch ( e.getKeyCode() ) {
			case KeyEvent.VK_UP :
				up();
				break;
			case KeyEvent.VK_LEFT :
				left();
				break;
			case KeyEvent.VK_DOWN :
				down();
				break;
			case KeyEvent.VK_RIGHT :
				right();
				break;
			default :
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
		
	}
	private void left() {
		// TODO Auto-generated method stub
		
	}
	private void up() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


