package contract;

/**
 * The Interface IController.
 *
 * @author Boriska mbilongo
 */
public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(Direction direction);
	public void possibility();
	public boolean canMove();
}
