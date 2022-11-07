package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground extends StaticElement{

	public Ground() throws IOException {
		// TODO Auto-generated constructor 
		permeability =Permeability.PENETRABLE;
		BufferedImage groundImage = ImageIO.read(new File("sprites/ground.png"));
		sprites.put("normalground", groundImage);
		setActualSprite(getSprite("normalground"));
	}

}
