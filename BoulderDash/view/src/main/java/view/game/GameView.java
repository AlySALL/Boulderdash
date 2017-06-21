package view.game;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import org.omg.CORBA.portable.BoxedValueHelper;

public class GameView extends JPanel{
	private GameArea GameZone;
	private InfosArea InfosZone;
	
	public GameView(){
		this.InfosZone = new InfosArea();
		this.GameZone = new GameArea();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(InfosZone);
		this.add(GameZone);
	}
	
	

}
