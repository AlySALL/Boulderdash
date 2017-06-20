package view;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JFrame {
	private int height;
	private int width;
	
	public MainView(int height, int width){
	 this.height = height;
	 this.width = width;
	 InitView();
	 FillView();
	 }
	public void InitView(){
		this.setTitle("BoulderDash");
		this.setResizable(false);
	    this.setSize(this.height, width);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    
	//	ScoreView scoreView = new ScoreView(0,0,0);
		JPanel Infos = new JPanel();
		Infos.setLayout(new BoxLayout(Infos,BoxLayout.PAGE_AXIS));
		JLabel Lscore= new JLabel( "Score : ");
		JLabel Ltime = new JLabel(" Time : " );
		JLabel LNbDiaments = new JLabel (" Diamonds: " );
		
		Infos.add(Lscore);
		Infos.add(Ltime);
		Infos.add(LNbDiaments);
	    this.setLayout(new BorderLayout());  
		this.add(Infos,BorderLayout.WEST);
		this.setVisible(true);
	}
	public void FillView(){

		
	}
		
	  
	

}
