package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rock extends MobileElement{
	
	public Rock() throws IOException {
		// TODO Auto-generated constructor stub
		permeability = Permeability.MOVABLE;
		BufferedImage rockImage = ImageIO.read(new File("sprites/74359.png"));
		
		BufferedImage blackRock = rockImage.getSubimage(48, 16, 16, 16);
		sprites.put("blackRock", blackRock);
		
		setActualSprite(getSprite("blackRock"));
	}

}
