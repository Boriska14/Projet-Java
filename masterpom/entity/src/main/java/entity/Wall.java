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
		sprites.put("normalWall", wallImage);
		setActualSprite(getSprite("normalWall"));
	}
	
	

}
