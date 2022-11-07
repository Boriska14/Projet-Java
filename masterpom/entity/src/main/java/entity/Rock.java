package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rock extends MobileElement{
	private Permeability permeability;
	public Rock() throws IOException {
		// TODO Auto-generated constructor stub
		permeability = Permeability.MOVABLE;
		BufferedImage rockImage = ImageIO.read(new File("sprites/rock.png"));
		sprites.put("normal", rockImage);
		setActualSprite(getSprite("normal"));
	}

}
