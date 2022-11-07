package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Diamond extends MobileElement{
	private Permeability permeability;
	public Diamond() throws IOException {
		// TODO Auto-generated constructor stub
		permeability = Permeability.POINT;
		BufferedImage diamondImage = ImageIO.read(new File("sprites/diamond.png"));
		sprites.put("diamond", diamondImage);
		setActualSprite(getSprite("diamond"));
	}
	
}
