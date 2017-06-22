package model.Animation;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
public class TableAnimation {
	public static  int SPEED_ANIM = 1;
	private static Map<ChoiceAnimation, Animation> tableAnimations = new HashMap<>();
/**
 * 
 * @return
 * Move from the current cell to the next with coordinates (x, y)
 * 
 * for example move right : (1, 1) to (2,1)
 */
	public static Animation getPapillon() {

		if (tableAnimations.get(ChoiceAnimation.Butterfly).equals(null)) {

			Sprite spriteButterfly = new Sprite("enemies");
			BufferedImage[] bfly = { spriteButterfly.getSprite(0, 1),spriteButterfly.getSprite(1, 1),spriteButterfly.getSprite(2, 1) };
			@SuppressWarnings("unused")
			Animation put = tableAnimations.put(ChoiceAnimation.Butterfly, new Animation(bfly,SPEED_ANIM));
		}
		tableAnimations.get(ChoiceAnimation.Butterfly).start();
		return tableAnimations.get(ChoiceAnimation.Butterfly);
	}
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static Animation getPlayerWalkRight() {
		if (tableAnimations.get(ChoiceAnimation.Player_Walk_Right).equals(null)) {
			Sprite spritePlayer = new Sprite("rockford");
			BufferedImage[] walkingRight = { spritePlayer.getSprite(1, 1),spritePlayer.getSprite(2, 1) };
			tableAnimations.put(ChoiceAnimation.Player_Walk_Right,new Animation(walkingRight, SPEED_ANIM));
		}
		tableAnimations.get(ChoiceAnimation.Player_Walk_Up).start();
		return tableAnimations.get(ChoiceAnimation.Player_Walk_Right);

	}
	/**
	 * create a object sprite player to walk and use the sprite "Rockford"
	 * @return
	 */
	@SuppressWarnings("unused")
	private static  Animation getPlayerWalkLeft() {
		if (tableAnimations.get(ChoiceAnimation.Player_walk_Left).equals(null)) {
			Sprite spritePlayer = new Sprite("rockford");
			BufferedImage[] walkingLeft = { spritePlayer.getSprite(1, 0),spritePlayer.getSprite(2, 0) };
			tableAnimations.put(ChoiceAnimation.Player_walk_Left,new Animation(walkingLeft, SPEED_ANIM));
		}
		tableAnimations.get(ChoiceAnimation.Player_walk_Left).start();
		return tableAnimations.get(ChoiceAnimation.Player_walk_Left);
	}
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static Animation getPlayerWalkUp(){ if(tableAnimations.get(ChoiceAnimation.Player_Walk_Up).equals(null)){
		Sprite spritePlayer = new Sprite("rockford");
		BufferedImage[] walkingUp ={ spritePlayer.getSprite(1,2),spritePlayer.getSprite(1,3)};
		tableAnimations.put(ChoiceAnimation.Player_Walk_Up,new Animation(walkingUp, SPEED_ANIM));
		
	}
	tableAnimations.get(ChoiceAnimation.Player_Walk_Up).start();
	return tableAnimations.get(ChoiceAnimation.Player_Walk_Up);
	
	}
	public static Animation getWall() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Animation getCaseNull() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Animation getDiamond() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Animation getRock() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Animation getButterFly() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
