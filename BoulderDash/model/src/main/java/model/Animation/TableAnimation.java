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
 */
	public static Animation getPapillon() {

		if (tableAnimations.get(ChoiceAnimation.Butterfly).equals(null)) {

			Sprite spriteButterfly = new Sprite("mechants");
			BufferedImage[] bfly = { spriteButterfly.getSprite(0, 1),
					spriteButterfly.getSprite(1, 1),
					spriteButterfly.getSprite(2, 1) };
			@SuppressWarnings("unused")
			Animation put = tableAnimations.put(ChoiceAnimation.Butterfly, new Animation(
					bfly,SPEED_ANIM));
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
		if (tableAnimations.get(ChoiceAnimation.Personnage_Walk_Right).equals(null)) {
			Sprite spritePersonnage = new Sprite("rockford");
			BufferedImage[] walkingRight = { spritePersonnage.getSprite(1, 1),
					spritePersonnage.getSprite(2, 1) };
			tableAnimations.put(ChoiceAnimation.Personnage_Walk_Right,new Animation(
					walkingRight, SPEED_ANIM));
		}
		return null;

	}
}
