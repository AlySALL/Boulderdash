package view.game;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfosArea extends JPanel{
	private JLabel score;
	private JLabel time;
	private JLabel NbDiamond;
	
	public InfosArea(){
		InitInfoZone();
	
	}
	private void InitInfoZone(){
		NbDiamond = new JLabel("Remaing Diamonds: " );
		time = new JLabel("Remaing Time: ");
		score = new JLabel("Score: ");
	this.add(NbDiamond);
	this.add(time);
	this.add(score);
	this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

	}
	
	public JLabel GetNbDiamond(){
		return NbDiamond;
	}
	public JLabel GetTime(){
		return time;
	}
	
	public JLabel GetScore(){
		return score;
	}

}
