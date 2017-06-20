package model.Animation;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 
 * @author ALY
 *
 */
public class Sprite {

	private String srcImage;
	private BufferedImage sprite;

	public Sprite(String src) {
		this.setSrcImage(src);
	}

	public static BufferedImage loadSprite(String file) {

		BufferedImage sprite = null;

		try {
			sprite = ImageIO.read(new File("sprites/" + file + ".png"));
		} catch (IOException e) {
			System.err.println("error loading sprite");
			e.printStackTrace();
		}

		return sprite;
	}

	public BufferedImage getSprite() {
		return sprite;
	}
	
	public void setSpriteSheet(BufferedImage sprite) {
		this.sprite = sprite;
	}

	public String getSrcImage() {
		return srcImage;
	}

	public void setSrcImage(String srcImage) {
		this.srcImage = srcImage;
	}

	public BufferedImage getSprite(int xGrid, int yGrid) {

		if (sprite.equals(null)) {
			sprite = loadSprite(this.srcImage);
		}

		return sprite.getSubimage(xGrid * 16, yGrid * 16, 16,16);
	}
}


