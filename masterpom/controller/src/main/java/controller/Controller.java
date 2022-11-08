package controller;


import entity.Element;
import entity.Floor;
import entity.Ground;
import entity.Permeability;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;

import contract.Direction;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {
	
	
	int  newPosition = 0;
	BufferedImage newSprite ;
	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}
	
	//public boolean collision() {
		//boolean collision = false;
	//	for ()
		
	//}

	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(Direction direction) {

		int nextElementX = 0;
		int nextElementY = 0;
		int nextElement2X = 0;
		int nextElement2Y = 0;
 		Element nextElement = this.model.getMap().getElement(this.model.getPlayer().getX(), this.model.getPlayer().getY()-1);

		
		switch (direction) {
		
		case UP:

			nextElementX = this.model.getPlayer().getX();
			nextElementY = this.model.getPlayer().getY()-1;
			nextElement2X = this.model.getPlayer().getX();
			nextElement2Y = this.model.getPlayer().getY()-2;
			nextElement = this.model.getMap().getElement(nextElementX, nextElementY);

				switch(nextElement.getPermeability()) {
				case BLOCKING:
					break;
				case GAMEOVER:
					break;
				case MOVABLE:

					if ( ! ((this.model.getMap().getElement(nextElement2X, nextElement2Y)).getPermeability() == Permeability.PENETRABLE) ) {
						break;
					}
					
					this.model.getMap().setElement(nextElement2X, nextElement2Y, nextElement);
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				case PENETRABLE:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Floor());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					this.model.notifyObserver();

					this.model.getPlayer().setY(this.model.getPlayer().getY()-1);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("upPlayer"));
					break;
				
				case POINT:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.model.getPlayer().setY(nextElementY);
					this.model.getPlayer().setX(nextElementX);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("upPlayer"));
					this.model.setScore(this.model.getScore()+50);
					break;
				default:
					break;
				
				};
				break;
			
			
		case DOWN:
			

			nextElementX = this.model.getPlayer().getX();
			nextElementY = this.model.getPlayer().getY()+1;
			nextElement2X = this.model.getPlayer().getX();
			nextElement2Y = this.model.getPlayer().getY()+2;

			nextElement = this.model.getMap().getElement(nextElementX, nextElementY);
				switch(nextElement.getPermeability()) {
				case BLOCKING:
					break;
				case GAMEOVER:
					break;
				case MOVABLE:

					if ( ! ((this.model.getMap().getElement(nextElement2X, nextElement2Y)).getPermeability() == Permeability.PENETRABLE) ) {
						break;
					}
					
					this.model.getMap().setElement(nextElement2X, nextElement2Y, nextElement);
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				case PENETRABLE:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Floor());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					this.model.notifyObserver();

					this.model.getPlayer().setY(this.model.getPlayer().getY()+1);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("downPlayer"));
					break;
				
				case POINT:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.model.getPlayer().setY(nextElementY);
					this.model.getPlayer().setX(nextElementX);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("downPlayer"));
					this.model.setScore(this.model.getScore()+50);
					break;
				default:
					break;
				
				};
				break;
			
			
		case LEFT:
			nextElementX = this.model.getPlayer().getX()-1;
			nextElementY = this.model.getPlayer().getY();
			nextElement2X = this.model.getPlayer().getX()-2;
			nextElement2Y = this.model.getPlayer().getY();
			nextElement = this.model.getMap().getElement(nextElementX, nextElementY);
				
				switch(nextElement.getPermeability()) {
				case BLOCKING:
					break;
				case GAMEOVER:
					break;
				case MOVABLE:

					if ( ! ((this.model.getMap().getElement(nextElement2X, nextElement2Y)).getPermeability() == Permeability.PENETRABLE) ) {
						break;
					}
					
					this.model.getMap().setElement(nextElement2X, nextElement2Y, nextElement);
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				case PENETRABLE:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Floor());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					this.model.notifyObserver();

					this.model.getPlayer().setX(this.model.getPlayer().getX()-1);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("leftPlayer"));
					break;
				
				case POINT:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.model.getPlayer().setY(nextElementY);
					this.model.getPlayer().setX(nextElementX);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("leftPlayer"));
					this.model.setScore(this.model.getScore()+50);
					break;
				default:
					break;
				
				};
				break;
			
			
		case RIGHT:
			nextElementX = this.model.getPlayer().getX()+1;
			nextElementY = this.model.getPlayer().getY();
			nextElement2X = this.model.getPlayer().getX()+2;
			nextElement2Y = this.model.getPlayer().getY();
			
			nextElement = this.model.getMap().getElement(nextElementX, nextElementY);

				switch(nextElement.getPermeability()) {
				case BLOCKING:
					break;
				case GAMEOVER:
					break;
				case MOVABLE:

					if ( ! ((this.model.getMap().getElement(nextElement2X, nextElement2Y)).getPermeability() == Permeability.PENETRABLE) ) {
						break;
					}
					
					this.model.getMap().setElement(nextElement2X, nextElement2Y, nextElement);
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				case PENETRABLE:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Floor());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					this.model.notifyObserver();

					this.model.getPlayer().setX(this.model.getPlayer().getX()+1);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("rightPlayer"));
					break;
				
				case POINT:
					try {
						this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.model.getPlayer().setY(nextElementY);
					this.model.getPlayer().setX(nextElementX);
					this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("rightPlayer"));
					this.model.setScore(this.model.getScore()+50);
					break;
				default:
					break;
				
				};
				break;
			
			
		default:
			break;
	}
				System.out.println(this.model.getPlayer().getY());
			
	}
	
	
	
	/*public boolean canMove(Direction direction) {
		int nextElementX = 0;
		int nextElementY = 0;
		int nextElement2X = 0;
		int nextElement2Y = 0;
		 
		boolean test=false;

		switch(direction) {
		case DOWN:
			nextElementX = this.model.getPlayer().getX();
			nextElementY = this.model.getPlayer().getY()+1;
			nextElement2X = this.model.getPlayer().getX();
			nextElement2Y = this.model.getPlayer().getY()+2;
			break;
		case LEFT:
			nextElementX = this.model.getPlayer().getX()-1;
			nextElementY = this.model.getPlayer().getY();
			nextElement2X = this.model.getPlayer().getX()-2;
			nextElement2Y = this.model.getPlayer().getY();
			break;
		case RIGHT:
			nextElementX = this.model.getPlayer().getX()+1;
			nextElementY = this.model.getPlayer().getY();
			nextElement2X = this.model.getPlayer().getX()+2;
			nextElement2Y = this.model.getPlayer().getY();
			break;
		case STATIC:
			break;
		case UP:
			nextElementX = this.model.getPlayer().getX();
			nextElementY = this.model.getPlayer().getY()-1;
			nextElement2X = this.model.getPlayer().getX();
			nextElement2Y = this.model.getPlayer().getY()-2;
			break;
		default:
			break;
			
		}
	
			
		Element nextElement = this.model.getMap().getElement(nextElementX, nextElementY);
		
		if (nextElement.getPermeability() != Permeability.BLOCKING) {
			return true;
		}
		return false;*/
		
	
		/*switch(nextElement.getPermeability()) {
		case BLOCKING:
			break;
		case GAMEOVER:
			break;
		case MOVABLE:

			if ( ! ((this.model.getMap().getElement(nextElement2X, nextElement2Y)).getPermeability() == Permeability.PENETRABLE) ) {
				break;
			}
			
			this.model.getMap().setElement(nextElement2X, nextElement2X, nextElement);
			try {
				this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		case PENETRABLE:
			
			break;
		r
		case POINT:
			try {
				this.model.getMap().setElement(nextElementX, nextElementY, new Ground());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.model.getPlayer().setY(nextElementY);
			this.model.getPlayer().setX(nextElementX);
			this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("upPlayer"));
			this.model.setScore(this.model.getScore()+50);
			break;
		default:
			break;
		
		}*/
		
		
	
	
	
	@Override
	public void possibility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
