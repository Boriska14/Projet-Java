package controller;


import contract.Direction;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

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
		switch (direction) {
			case UP:
				this.model.getPlayer().setY(this.model.getPlayer().getY()-1);
				this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("upPlayer"));
				break;
			case DOWN:
				this.model.getPlayer().setY(this.model.getPlayer().getY()+1);
				this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("downPlayer"));
				break;
			case LEFT:
				this.model.getPlayer().setX(this.model.getPlayer().getX()-1);
				this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("leftPlayer"));
				break;
			case RIGHT:
				this.model.getPlayer().setX(this.model.getPlayer().getX()+1);
				this.model.getPlayer().setActualSprite(this.model.getPlayer().getSprite("rightPlayer"));
				break;
			default:
				break;
		}
		
		this.model.notifyObserver();
		System.out.println(this.model.getPlayer().getY());
	}

}
