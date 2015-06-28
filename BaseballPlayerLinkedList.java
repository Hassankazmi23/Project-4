import java.awt.TextArea;
/**
 * This is the BaseballPlayerLinkedLIst
 */


public class BaseballPlayerLinkedList {

	private BaseballPlayerNode first; // dummy


	/**
	 * This method gets the first BaseballPlayer node
	 * @return returns first baseballplayer node
	 */
	public BaseballPlayerNode getFirst(){
		return first;
	}

	/**
	 * This is the constructor for BaseballPlayerLinkedList
	 */
	public BaseballPlayerLinkedList(){
		first = new BaseballPlayerNode(null, null); // makes a dummy node
	}
	/**
	 * This method inserts baseballplayer 
	 * @param bp baseballplayer 
	 */
	public void insert(BaseballPlayer bp){
		BaseballPlayerNode x = first;
		// after this loop is finished, x points to the node
		//just before the spot where you want to insert
		while(x.getNext() !=null   && x.getNext().getPlayer().compareTo(bp) < 0 ){
			x = x.getNext();
		} // the sorting algorithm for baseballplayers in order to organize the player by their number
		BaseballPlayerNode newNode = new BaseballPlayerNode(bp, x.getNext());
		x.setNext(newNode);
	}



}
