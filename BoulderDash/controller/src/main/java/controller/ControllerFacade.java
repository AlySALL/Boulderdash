package controller;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;

import model.Example;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

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

    /**
     * Start.
     * @return 
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void GestionBoutonEditeur(JButton b1, JButton b2, JButton b3, JButton b4) {

		this.button1 = b1;
		this.button2 = b2;
		this.button3 = b3;
		this.button4 = b4;
		
	}
    public void start() throws SQLException {
        //this.getView().displayMessage(this.getModel().getExampleById(1).toString());
    	view.
        this.getView().displayMessage(this.getModel().getLevel1().toString());

        final List<Example> examples = this.getModel().getLevel1();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example level1 : examples) {
            message.append(level1);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
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
