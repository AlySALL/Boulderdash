package controller;

import java.awt.Window;
import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 * @param <MainView>
 */
public class ControllerFacade implements IController {

	/** The view. */
	private final IView  view;

	/** The model. */
	private final IModel model;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public ControllerFacade(final IView view, final IModel model) {
		super();
		this.view = view;
		this.model = model;  
	}
	
	public void update(){
	view.update();
	}
	

	/**
<<<<<<< HEAD
	 * Start
	 * @return 
=======
	 * Start.
>>>>>>> e4fa2bee2fa3fd558338a7eb4369812b93fdc841
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */

	public void start() throws SQLException {
		view.InitView();
		model.up();
		model.left();
		model.down();
		model.right();

	}
	/*final StringBuilder message = new StringBuilder();
=======
    public void start() throws SQLException {

        final StringBuilder message = new StringBuilder();
>>>>>>> e4fa2bee2fa3fd558338a7eb4369812b93fdc841
        // a.append(" bar);
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }*/

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IView getView() {
		return this.view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return this.model;
	}
}
