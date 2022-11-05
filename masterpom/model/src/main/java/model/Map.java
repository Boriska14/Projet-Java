package model;

import contract.IMap;
import entity.Element;

public class Map implements IMap{
	
	private Element table[][];
	private int width = 40;
	private int height = 30;
	 
	public Map() {
		table = new Element[width][height];
	}
	
	public Element getElement(int x,int y) {
		return table[x][y];
	} 
	
	public void setElement(int x,int y,Element element) {
		table[x][y] = element;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
	
}
