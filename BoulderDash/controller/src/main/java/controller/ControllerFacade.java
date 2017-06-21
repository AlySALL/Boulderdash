package controller;

import java.awt.Window;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;

import model.Example;
import model.IModel;
import view.IView;
import view.#;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 * @param <MainView>
 */
public class ControllerFacade implements IController{

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
        MainView window = new MainView(16,16);
        
    }

    /**
     * Start
     * @return 
     *
     * @throws SQLException
     *             the SQL exception
     */
		
	
    public void start() throws SQLException {
    			window.InitView();
    			}
        /*final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example level1 : examples) {
            message.append(level1);
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
