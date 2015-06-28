/**
 * 
 * @author Samee Bashar
 * This is the public class for BaseballPlayerListIterator 
 */
public class BaseballPlayerListIterator {

	private BaseballPlayerLinkedList list;
	private BaseballPlayerNode iterator;

	/**
	 * This is the BaseballPlayerLIstIterator constructor 	
	 * @param list
	 */
	BaseballPlayerListIterator(BaseballPlayerLinkedList list){
		this.list = list; 
		iterator = list.getFirst().getNext(); 
	}

	/**
	 * This method iterates thought the linked list to get all the baseballplayer nodes
	 * @return returns player
	 */
	public BaseballPlayer Iterate(){

		BaseballPlayer player = null;
		if(iterator != null){
			player = iterator.getPlayer();
			iterator = iterator.getNext();
		}
		return player;

	}
	/**
	 * Method that resets iterator 
	 */
	void resetIterator(){
		iterator = list.getFirst();
	}


}
