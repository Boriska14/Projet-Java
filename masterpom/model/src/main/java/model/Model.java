package model;

import java.io.IOException;

import contract.IModel;
import contract.IObserver;

//import java.sql.SQLException;
//import java.util.Observable;

//import contract.IModel;
//import entity.HelloWorld;
import entity.Player;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model implements IModel  {

	/** The helloWorld. */
	private IObserver observer;
	private Player player;
	private int score;
	
	private Map map;
	/**
	 * Instantiates a new model.
	 * @throws IOException 
	 */
	public Model() throws IOException {
		this.map = new Map();
		System.out.println(map);

		this.player = new Player();
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public void setObserver(IObserver o) {
		// TODO Auto-generated method stub
		this.observer = o;
	}
	@Override
	public void notifyObserver() {
		this.observer.update();
	}


	
}
