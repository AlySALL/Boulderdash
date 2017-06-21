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
	private static Animation getPersonnageWalkRight() {
		if (tableAnimations.get(ChoiceAnimation.Player_Walk_Right).equals(null)) {
			Sprite spritePersonnage = new Sprite("rockford");
			BufferedImage[] walkingRight = { spritePersonnage.getSprite(1, 1),spritePersonnage.getSprite(2, 1) };
			tableAnimations.put(ChoiceAnimation.Player_Walk_Right,new Animation(walkingRight, SPEED_ANIM));
		}
		return tableAnimations.get(ChoiceAnimation.Player_Walk_Right);

	}
	@SuppressWarnings("unused")
	private static  Animation getPersonnageWalkLeft() {
		if (tableAnimations.get(ChoiceAnimation.Player_walk_Left).equals(null)) {
			Sprite spritePersonnage = new Sprite("rockford");
			BufferedImage[] walkingLeft = { spritePersonnage.getSprite(1, 0),spritePersonnage.getSprite(2, 0) };
			tableAnimations.put(ChoiceAnimation.Player_walk_Left,new Animation(walkingLeft, SPEED_ANIM));
		}
		tableAnimations.get(ChoiceAnimation.Player_walk_Left).start();
		return tableAnimations.get(ChoiceAnimation.Player_Walk_Right);
	}
}
