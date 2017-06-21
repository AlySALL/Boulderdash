package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreView extends JPanel{
	private int score;
	private int time;
	private int NbDiamond;
	
	public ScoreView(int score, int time, int NbDiamond){
		JPanel Infos = new JPanel();
		JLabel Lscore= new JLabel( "Score : " + score);
		JLabel Ltime = new JLabel(" Time : " + time);
		JLabel LNbDiamond = new JLabel (" Diamond: " + NbDiamond);
		
		Infos.add(Lscore);
		Infos.add(Ltime);
		Infos.add(LNbDiamond);
	}
	

}
