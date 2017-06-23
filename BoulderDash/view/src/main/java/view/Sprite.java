package view;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Sprite {

	private Sprite() {

	}

	public static BufferedImage GetPapillon(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(10 * 16, 0, 16, 16);
	}

	public static BufferedImage GetPlayer(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(0, 0, 16, 16);
	}

	public static BufferedImage GetDefault(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(2, 0, 16, 16);
	}

	public static BufferedImage GetDiamant(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(4, 0, 16, 16);
	}

	public static BufferedImage GetRock(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(3, 0, 16, 16);
	}

	public static BufferedImage GetWall(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(6, 0, 16, 16);
	}

	public static BufferedImage GetQuit(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(6, 0, 16, 16);
	}

	public static BufferedImage GetEmpty(String spritename) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File("Sprites/" + spritename + ".png"));
		} catch (IOException e) {
			System.err.println("Images doesnt not found ");
			e.printStackTrace();
		}
		return Image.getSubimage(2, 0, 16, 16);
	}
}

