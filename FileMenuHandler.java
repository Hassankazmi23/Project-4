import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class handles what happens when the user clicks on an item in the File menu
 *
 */
public class FileMenuHandler implements ActionListener {
	JFrame jframe;
	public FileMenuHandler (JFrame jf) {
		jframe = jf;
	}
	/*
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) { //Open menu item
			JFileChooser fc = new JFileChooser("./"); 
			fc.setFileSelectionMode(JFileChooser.FILES_ONLY); //selecting the file
			fc.showOpenDialog(null);
			File f = fc.getSelectedFile(); //gets the selected file
			if(f != null){
				try {
					Project4.readFile(f.getAbsolutePath());; //read the file
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		else  if (menuName.equals("Quit"))  //Quit program
			System.exit(0);
	} //actionPerformed

}
