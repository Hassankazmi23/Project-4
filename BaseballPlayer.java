/**
 * 
 * @author Samee Bashar
 * This is the public class for BaseballPlayer
 */
public class BaseballPlayer {

	protected int number; //player number
	protected String firstName; 
	protected String lastName;
	protected float average; //player average 

	/**
	 * This is the BaseballPlayer constructor 
	 * @param num    player number
	 * @param fName  player first name 
	 * @param lName  player last name
	 * @param ba     player batting average 
	 */

	public BaseballPlayer(int num, String fName, String lName, float ba){
		if(num < 0 || num > 99)
			throw new IllegalArgumentException ("Number is not right"); //IllegalArguement comment
		number = num;
		firstName = fName;
		lastName = lName;
		if(ba > 1.0 || ba < 0.0)
			throw new IllegalArgumentException("Batting Average is not correct"); //IllegalArgument Comment
		average = ba;

	}
	/**
	 * This method compares Baseballplayers by their number 
	 * @param other the other player
	 * @return returns a number which is the difference of 2 baseballplayer numbers 
	 */

	public int compareTo(BaseballPlayer other){
		// returns  a negative number if this player number is less than other player  number
		// returns zero if this player number == other player number
		// returns positive a number if this player number is greater than other player number
		return number - other.number;
	}

}
