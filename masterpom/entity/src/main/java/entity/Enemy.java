package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends MobileElement{
	private Permeability permeability;
	public Enemy() {
		// TODO Auto-generated constructor stub
		permeability = Permeability.GAMEOVER;
		
	}

}
