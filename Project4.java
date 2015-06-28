import java.io.*;
import java.util.Scanner;
/**
 * 
 * A program that reads from a text file and organizes the data and displays All the players or specific type of players depending on the menu item clicked
 */
public class Project4 {
	static BaseballPlayerLinkedList list; //Baseballplayerlinkedlist
	static PlayerGui gui;

	public static void main(String[] args) throws FileNotFoundException{
		list = new BaseballPlayerLinkedList(); //makes a linked list
		gui = new PlayerGui(); //makes a gui
		//readFile(args[0]); //read worlds from a file

		//gui.print(list); //prints the baseballplayer list 
	}
	/**
	 * This method uses a Scanner to read information from a file
	 * @param Filename
	 * @throws FileNotFoundException
	 */
	public static void readFile(String Filename) throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader(Filename)); //read words from a file
		while(in.hasNextLine()){
			String line = in.nextLine();
			//writes unsorted player data to the left sector of the gui
			//gui.writeToTextArea(line + "\n"); //writes to text area 

			String[] array = line.split(","); //splits the line 
			BaseballPlayer newPlayer;
			try {
				if (array[0].equals("P") && array.length==6) {//if the pitcher is found then store the data in the pitcher newPlayer
					newPlayer = new Pitcher(Integer.parseInt(array[1]), array[3], array[2], Float.parseFloat(array[4]), Float.parseFloat(array[5]));
					list.insert(newPlayer); //insert into linked list
				}
				else  if (array[0].equals("F") && array.length==5){ ////else if the Fielder is found then store the data in the Fielder newPlayer
					newPlayer = new Fielder(Integer.parseInt(array[1]), array[3], array[2], Float.parseFloat(array[4]));
					list.insert(newPlayer); //insert into the linked list 
				}
				else System.out.println(line);
			}
			catch (IllegalArgumentException problemCatcher) {
				System.out.println(problemCatcher.getMessage() + ": " + line);
			}
		}
		in.close(); //to close scanner
		gui.printAll(list); // Prints the whole list of players 
	}
}


