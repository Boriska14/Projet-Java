package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall extends StaticElement{

	public Wall() throws IOException {
		// TODO Auto-generated constructor stub
		permeability=Permeability.BLOCKING;
		BufferedImage wallImage = ImageIO.read(new File("sprites/74359.png"));
		BufferedImage bluewall = wallImage.getSubimage(0, 0, 16, 16);
		sprites.put("bluewall", bluewall);
		setActualSprite(getSprite("bluewall"));
	}
	
	

}
