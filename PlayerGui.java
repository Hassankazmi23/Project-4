import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * 
 * @author Samee Bashar
 * The public class PlayerGui will display the information in a pop-up box/window
 */
public class PlayerGui extends JFrame {
	private TextArea textArea; //text area 
	JMenuBar menuBar;
	/**
	 * This method prints the whole BaseballPlayerLinkedList
	 * @param list BaseballPlayerLinkedList list 
	 */
	public void printAll(BaseballPlayerLinkedList list) {
		setTitle("All Players");
		textArea.setText("");
		BaseballPlayerListIterator iterator = new BaseballPlayerListIterator(list); //iterate through the baseballplayer list
		BaseballPlayer player = null;
		while ((player = iterator.Iterate())!= null) {
			textArea.append(player.toString() + "\n"); //All players go in the text area 

		}
	}

	/**
	 * This method prints the pitchers
	 * @param list BaseballPlayerLinkedList list 
	 */
	public void printPitchers(BaseballPlayerLinkedList list) {
		setTitle("Pitchers");
		textArea.setText("");
		BaseballPlayerListIterator iterator = new BaseballPlayerListIterator(list); //iterate through the baseballplayer list
		BaseballPlayer player = null;
		while ((player = iterator.Iterate())!= null) {
			if (player instanceof Pitcher)
				textArea.append(player.toString() + "\n"); //Pitchers go in the text area

		}
	}

	/**
	 * This method prints the fielders
	 * @param list BaseballPlayerLinkedList list 
	 */
	public void printFielders(BaseballPlayerLinkedList list) {
		setTitle("Fielders");
		textArea.setText("");
		BaseballPlayerListIterator iterator = new BaseballPlayerListIterator(list); //iterate through the baseballplayer list
		BaseballPlayer player = null;
		while ((player = iterator.Iterate())!= null) {
			if (player instanceof Fielder)
				textArea.append(player.toString() + "\n"); //Fielders go in the text area


		}
	}

	/*
	 * Function for writing to text area in the gui 
	 */
	public void writeToTextArea(String str){

		textArea.append(str); //writes to the text area of gui 

	}

	/*
	 * The gui setup 
	 */
	public PlayerGui(){
		setTitle("Project 4");
		setSize(600,600);
		setLocation  (150,150);
		createMenus();
		textArea = new TextArea(); //text area to display data
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		cPane.add(textArea);
		setVisible(true);
	}
	/**
	 * This method adds the menus to the GUI
	 * 
	 */
	private void createMenus() {
		JMenuItem   item;
		JMenuBar    menuBar  = new JMenuBar(); //the menu bar which will appear in the GUI
		JMenu       fileMenu = new JMenu("File"); //File menu button
		FileMenuHandler fmh  = new FileMenuHandler(this); //passing in a REFERENCE to this SampleGUI object, not a copy!

		item = new JMenuItem("Open");    //Open button
		item.addActionListener( fmh );  //assign listener to Open button 
		fileMenu.add( item ); 		//put Open button in File menu

		fileMenu.addSeparator();           //add a horizontal separator line

		item = new JMenuItem("Quit");       //Quit
		item.addActionListener( fmh ); 	 //assign listener to Quit button
		fileMenu.add( item );				//put Quit button in File menu

		JMenu displayMenu = new JMenu("Display"); //Display Menu button
		DisplayMenuHandler emh  = new DisplayMenuHandler(this); //passing in a REFERENCE to this SampleGUI object, not a copy!

		item = new JMenuItem("All");    //All
		item.addActionListener(emh);  //assign listener to All button
		displayMenu.add(item); 			//put All button in Display menu

		displayMenu.addSeparator();           //add a horizontal separator line

		item = new JMenuItem("Fielder");    //Fielder
		item.addActionListener(emh);  //assign listener to Fielder button
		displayMenu.add(item); 			//put Fielder button in Display menu

		item = new JMenuItem("Pitcher");    //Pitcher
		item.addActionListener(emh);  //assign listener to Pitcher button
		displayMenu.add(item); 			//put Pitcher button in Display menu


		setJMenuBar(menuBar); //set menuBar to be this GUI's men bar
		menuBar.add(fileMenu); //add the File menu to the menu bar
		menuBar.add(displayMenu); //add the Display menu to the menu bar

	} 
}
