package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Butterfly extends Enemy{

	
	public Butterfly() throws IOException {
		// TODO Auto-generated constructor stub
		BufferedImage butterflyImage = ImageIO.read(new File("sprites/74359.png"));
		
		BufferedImage butterfly1 = butterflyImage.getSubimage(160, 16, 16, 16);
		sprites.put("but1", butterfly1);
		this.setX(10);
		this.setY(10);
	}

}
