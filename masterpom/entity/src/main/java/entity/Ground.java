package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground extends StaticElement{

	public Ground() throws IOException {
		// TODO Auto-generated constructor 
		permeability =Permeability.PENETRABLE;
		BufferedImage groundImage = ImageIO.read(new File("sprites/74359.png"));
		BufferedImage normalground = groundImage.getSubimage(16, 0, 16, 16);
		sprites.put("normalground", normalground);
		setActualSprite(getSprite("normalground"));
	}

}
