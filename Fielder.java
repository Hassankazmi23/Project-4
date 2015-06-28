/**
 * 
 * @author Samee Bashar
 * This is the public class for the Fielder inherit from BaseballPlayer
 */
public class Fielder extends BaseballPlayer {

	/**
	 * This is a constructor for Fielder 
	 * @param num       Fielder number
	 * @param firstName Fielder first name
	 * @param lastName  Fielder last name
	 * @param ba        Fielder batting average 
	 */

	public Fielder(int num, String firstName, String lastName, float ba){
		super(num,firstName,lastName,ba); //number, first name, last name, batting average of Fielder
	}

	/**
	 * toString method
	 */

	public String toString() {
		return "F," + number + "," + lastName + "," + firstName + "," + average;
	}  //F for fielder, number, last name, fist name and fielder average 

}
