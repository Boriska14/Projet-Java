package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends MobileElement{

	private boolean alive;
	
	public Player() throws IOException {
		// TODO Auto-generated constructor stub
		BufferedImage baseImage = ImageIO.read(new File("sprites/74336.png"));
		
		BufferedImage leftPlayer = baseImage.getSubimage(0, 16, 16, 16);
		sprites.put("leftPlayer", leftPlayer);
		BufferedImage staticPlayer = baseImage.getSubimage(0,0,16,16);
		sprites.put("staticPlayer", staticPlayer);
		BufferedImage rightPlayer = baseImage.getSubimage(0,48,16,16);
		sprites.put("rightPlayer", rightPlayer);
		BufferedImage downPlayer = baseImage.getSubimage(64,16,16,16);
		sprites.put("downPlayer", downPlayer);
		this.setX(10);
		this.setY(10);
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
		

}
