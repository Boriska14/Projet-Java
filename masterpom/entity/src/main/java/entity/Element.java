package entity;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Element {
	
	protected Map<String,BufferedImage> sprites = new HashMap<String,BufferedImage>();
	private BufferedImage actualSprite;
	
	


	public Element() {
		// TODO Auto-generated constructor stub
	}

	public BufferedImage getActualSprite() {
		return actualSprite;
	}



	public void setActualSprite(BufferedImage actualSprite) {
		this.actualSprite = actualSprite;
	}


	public  BufferedImage getSprite(String key) {
		return sprites.get(key);
	}

	public void setSprite(String key,BufferedImage sprite) {
		sprites.put(key, sprite);
	}
	
}
