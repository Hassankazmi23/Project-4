/**
 * This is the public class for BaseballPlayerNode
 */
public class BaseballPlayerNode {

	private BaseballPlayer player;
	private BaseballPlayerNode next;

	/**
	 * This is a BaseballPlayer node
	 * @param b baseballplayer
	 * @param n next baseballplayer 
	 */

	public BaseballPlayerNode(BaseballPlayer b,BaseballPlayerNode n){
		player = b;
		next = n;

	}
	/**
	 * This sets Baseballplayer
	 * @param p player
	 */

	void setPlayer(BaseballPlayer p){
		player = p;
	}

	/**
	 * Sets next baseballplayer
	 * @param next_node
	 */
	void setNext(BaseballPlayerNode next_node){
		next = next_node;
	}
	/**
	 * Get method for BaseballPlayer
	 * @return returns Baseballplayer
	 */

	BaseballPlayer getPlayer(){
		return player;
	}

	/**
	 * Get method for getting next BaseballPlayer in the node 
	 * @return returns next BaseballPlayer
	 */
	BaseballPlayerNode getNext(){
		return next;
	}
}
