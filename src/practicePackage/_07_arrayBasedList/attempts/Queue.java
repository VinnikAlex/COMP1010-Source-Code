package practicePackage._07_arrayBasedList.attempts;

public class Queue {
	public int size;
	public String[] items;
	
	/**
	 * initialize array to an empty array and size to 0
	 */
	public Queue() {
		items = new String[0];
		
	}
	
	/**
	 * 
	 * @return true if there are no items currently on the queue
	 * (note that the array may be of size 5 or 10 or ... and still be empty)
	 */
	public boolean isEmpty() {
		for(int i=0; i<items.length; i++) {
			if(items[i] == "" || items[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @return if no more items can be added to the queue.
	 * That is, the queue is at capacity
	 */
	public boolean isFull() {
		return isEmpty();
	}
	
	/**
	 * increase the capacity of the queue by 5
	 */
	public void grow() {
		String[] newArray = new String[items.length + 5];

		for (int i = 0; i < items.length; i++)
			newArray[i] = items[i];
		items = newArray;
		
	}
	
	/**
	 * add an item on "top" of the queue.
	 * For example, if the array is of length 10 and there are 7 items on the queue,
	 * the item passed is added as the 8th item, and now the queue size is 8.
	 * Note that nothing should be done if the passed String is null.
	 * @param s
	 */
	public void insert(String s) {
		
	}
	
	/**
	 * 
	 * @return the front item (and remove it) from the queue.
	 * return null if queue is empty.
	 */
	public String remove() {
		return ""; //to be completed
	}
	
	/**
	 * 
	 * @return the top item without removing it from the queue.
	 * return null if queue is empty.
	 */
	public String front() {
		return ""; //to be completed
	}
	
	/**
	 * @param idx: index of item to be removed
	 * @return the item at index idx from the queue. Assume that the index of the "bottom"
	 * item is 0, and the top item is size-1.
	 * return null if there is no item at passed index.
	 */
	public String get(int idx) {
//		if(isEmpty()) {
//			return null;
//		}
//		if(items[idx] == "") {
//			return null;
//		}
//		
return "";
	}
	
	/**
	 * return a string representation of the queue.
	 * if the queue has items "Me" (at index 2), "fail" (at index 1), 
	 * "English" (at index 0), 
	 * the String returned should be "Me\nFail\nEnglish".
	 * Return "" if the queue is empty.
	 */
	public String toString() {
		String result = "[";
		for (int i = 0; i < size; i++) {
			result = result + items[i] + ", ";
		}
		if (result.length() > 1) // not empty
			result = result.substring(0, result.length() - 2);
		return result + "]";
	}
}
