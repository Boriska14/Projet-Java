package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Floor extends StaticElement {

	public Floor() throws IOException {
		// TODO Auto-generated constructor stub
		permeability= Permeability.PENETRABLE;
		BufferedImage floorImage = ImageIO.read(new File("sprites/74359.png"));
		BufferedImage underGround = floorImage.getSubimage(32, 0, 16, 16);
		sprites.put("underGround", underGround);
		setActualSprite(getSprite("underGround"));
	}

}
