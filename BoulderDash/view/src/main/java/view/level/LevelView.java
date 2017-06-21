package view;

import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LevelView {
	private int LevelNb;
	
	public LevelView(int LevelNb){
		JPanel Level = new JPanel();    
	    JRadioButton level1 = new JRadioButton("Level 1");
	    
	    level1.setMnemonic(KeyEvent.VK_B);
	    level1.setActionCommand("Level 2");
	    level1.setSelected(true);

	    JRadioButton level2 = new JRadioButton("level 2");
	    level2.setMnemonic(KeyEvent.VK_C);
	    level2.setActionCommand("level 2");

	    JRadioButton level3 = new JRadioButton("level 3");
	    level3.setMnemonic(KeyEvent.VK_D);
	    level3.setActionCommand("level 3");

	    JRadioButton level4 = new JRadioButton("level 4");
	    level4.setMnemonic(KeyEvent.VK_R);
	    level4.setActionCommand("level 4");

	    JRadioButton level5 = new JRadioButton("level 5");
	    level5.setMnemonic(KeyEvent.VK_P);
	    level5.setActionCommand("level 5");

	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(level1);
	    group.add(level2);
	    group.add(level3);
	    group.add(level4);
	    group.add(level5);
	    
	    Level.add(level1);
	    Level.add(level2);
	    Level.add(level3);
	    Level.add(level4);
	    Level.add(level5);
	    
	        int rc = JOptionPane.showOptionDialog(null, Level, "Level Selection",
	        JOptionPane.PLAIN_MESSAGE, 0, null,null , null);
	 
	}

}
