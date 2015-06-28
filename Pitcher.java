/**
 * 
 * @author Samee Bashar
 * This is the public class Pitcher which inherits from BaseballPlayer
 */
public class Pitcher extends BaseballPlayer {

	public float era;
	/**
	 * 
	 * @param num        pitcher number
	 * @param firstName  pitcher first name 
	 * @param lastName   pitcher last name
	 * @param ba         pitcher batting average
	 * @param era        pitcher earn run average
	 */
	public Pitcher(int num, String firstName, String lastName, float ba, float era) {
		super(num,firstName,lastName,ba); //number, first name, last name, batting average of Pitcher
		this.era = era; //pitcher earn run average 
	}
	/**
	 * A toString method 
	 */
	public String toString() {
		return "P," + number + "," + lastName + "," + firstName + "," + average + "," + era;
	} 
}
