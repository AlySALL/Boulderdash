package model;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;


public class Player implements KeyListener{
	private static final String KEY_UP = null;
	private static final String KEY_DOWN = null;
	@SuppressWarnings("unused")
	private static final String KEY_LEFT = null;
	private static final String KEY_RIGHT = null;
	private Map<Integer, Boolean> keys;
	private Level level;


	public Player(Level level)
	{this.level = level;
	keys = new HashMap<>();
	keys.put(KeyEvent.VK_RIGHT, false);
	keys.put(KeyEvent.VK_LEFT, false);
	keys.put(KeyEvent.VK_UP, false);
	keys.put(KeyEvent.VK_DOWN, false);

}

@Override
public void keyTyped(KeyEvent e)
{
}

@Override
public void keyReleased(KeyEvent e)
{
	switch ( e.getKeyCode() ) {
		case KeyEvent.VK_UP :
			keys.put(KeyEvent.VK_UP, false);
			break;
		case KeyEvent.VK_LEFT :
			keys.put(KeyEvent.VK_LEFT, false);
			break;
		case KeyEvent.VK_DOWN :
			keys.put(KeyEvent.VK_DOWN, false);
			break;
		case KeyEvent.VK_RIGHT :
			keys.put(KeyEvent.VK_RIGHT, false);
			break;
		default :
			break;
	}
	if ( keys.get(KeyEvent.VK_RIGHT) ) {
		right();
	} else if ( keys.get(KeyEvent.VK_LEFT) ) {
		left();
	} else if ( keys.get(KeyEvent.VK_UP) ) {
		up();
	} else if ( keys.get(KeyEvent.VK_DOWN) ) {
		down();
	} else {
		//level.getProckford().setMove(Directions.Null);
	}
}

@Override
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

private void right()
{
	keys.put(KeyEvent.VK_RIGHT, true);
	//level.getProckford.setMove(this.Right);
}

private void down()
{
	keys.put(KeyEvent.VK_DOWN, true);
	//level.getProckford().setMove(Directions.Down);
}

private void left()
{
	keys.put(KeyEvent.VK_LEFT, true);
	//level.getProckford().setMove(Directions.Left);
}

private void up()
{
	keys.put(KeyEvent.VK_UP, true);
	//level.getProckford().setMove(Directions.Up);
}

public static String getKeyRight() {
	return KEY_RIGHT;
}

public static String getKeyUp() {
	return KEY_UP;
}

public static String getKeyDown() {
	return KEY_DOWN;
}

}


