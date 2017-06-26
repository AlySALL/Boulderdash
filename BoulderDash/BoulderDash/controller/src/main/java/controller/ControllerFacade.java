package controller;

import java.sql.SQLException;

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
	view.update(model);
	}
	

	/**
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */

	public void start() throws SQLException {
	this.view.InitView(model);
	}
	

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
