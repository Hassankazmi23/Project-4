import javax.swing.*;
import java.awt.event.*;
/**
 * 
 * @author Samee Bashar
 * This class handles what happens when the user clicks an item in the Display  menu
 *
 */

public class DisplayMenuHandler implements ActionListener{
	JFrame jframe;
	public DisplayMenuHandler (JFrame jf) {
		jframe = jf;
		// TODO Auto-generated constructor stub
	}
	/*
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */

	public void actionPerformed(ActionEvent event){


		String menuName = event.getActionCommand();
		if (menuName.equals("All")) //the All menu item
			Project4.gui.printAll (Project4.list); //print All the players to gui
		else if (menuName.equals("Pitcher")) //Pitcher menu item
			Project4.gui.printPitchers(Project4.list); //print all the pitchers to gui
		else if (menuName.equals("Fielder")) //Fielder menu item
			Project4.gui.printFielders(Project4.list);	 // print all the fielders to gui
	} //action performed method

} 





