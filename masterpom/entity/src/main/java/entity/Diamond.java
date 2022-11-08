package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Diamond extends MobileElement{

	public Diamond() throws IOException {
		// TODO Auto-generated constructor stub
		permeability = Permeability.POINT;
		BufferedImage diamondImage = ImageIO.read(new File("sprites/74359.png"));
		
		BufferedImage blueDiamond = diamondImage.getSubimage(64, 16, 16, 16);
		sprites.put("blueDiamond", blueDiamond);
		setActualSprite(getSprite("blueDiamond"));
	}
	
}
