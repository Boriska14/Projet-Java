package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall extends StaticElement{

	public Wall() throws IOException {
		// TODO Auto-generated constructor stub
		permeability=Permeability.BLOCKING;
		BufferedImage wallImage = ImageIO.read(new File("sprites/wall.png"));
		//BufferedImage blackwall = wallImage.getSubimage(16, 16, 16, 16);
		sprites.put("wallImage", wallImage);
		setActualSprite(getSprite("wallImage"));
	}
	
	

}
