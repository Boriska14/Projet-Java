package contract;

import entity.Player;


/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {
	public Player getPlayer();
	public IMap getMap();
	public int getScore();
	public void setScore(int score);
	public void setObserver(IObserver o);
	public void notifyObserver();
}
