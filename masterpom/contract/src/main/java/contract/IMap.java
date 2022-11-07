package contract;

import entity.Element;

public interface IMap {
	public Element getElement(int x,int y);
	
	public void setElement(int x,int y,Element element);

	public int getWidth();
	public int getHeight();
	public Element[][] getTable();
}
