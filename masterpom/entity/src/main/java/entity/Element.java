package entity;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Element {

	public Element() {
		// TODO Auto-generated constructor stub
	}

	protected Map<String,BufferedImage> sprites = new HashMap<String,BufferedImage>();

	public  BufferedImage getSprite(String key) {
		return sprites.get(key);
	}

	public void setSprite(String key,BufferedImage sprite) {
		sprites.put(key, sprite);
	}
	
}
