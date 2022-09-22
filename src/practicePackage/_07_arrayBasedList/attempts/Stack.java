package practicePackage._07_arrayBasedList.attempts;


public class Stack {
	public int size;
	public String[] items;
	
	/**
	 * initialize array to an empty array and size to 0
	 */
	public Stack() {
		items = new String[0];
	}
	
	/**
	 * 
	 * @return if there are no items currently on the stack
	 * (note that the array may be of size 5 or 10 or ... and still be empty)
	 */
	public boolean isEmpty() {
		for(int i=0; i<items.length; i++) {
			if(items[i] != "") {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @return if no more items can be added to the stack.
	 * That is, the stack is at capacity
	 */
	public boolean isFull() {
		return size == items.length;
	}
	
	/**
	 * increase the capacity of the stack by 5
	 */
	public void grow() {
		String[] newArray = new String[items.length + 5];

		for (int i = 0; i < items.length; i++)
			newArray[i] = items[i];
		items = newArray;
	}
	
	/**
	 * add an item on "top" of the stack.
	 * For example, if the array is of length 10 and there are 7 items on the stack,
	 * the item passed is added as the 8th item, and now the stack size is 8.
	 * Note that nothing should be done if the passed String is null.
	 * @param s
	 */
	public void push(String s) {
//		String[] newArray = new String[items.length+1];
//
//		for (int i = 1; i < items.length; i++)
//			newArray[i] = items[i];
//
//		newArray[0] = s;
		return;
	}
	
	/**
	 * 
	 * @return the top item (and remove it) from the stack.
	 * return null if stack is empty.
	 */
	public String pop() {
		return "";
	}
	
	/**
	 * 
	 * @return the top item without removing it from the stack.
	 * return null if stack is empty.
	 */
	public String top() {
		
		if (isEmpty()) {
			return null;
		}
		
		return items[0];
	}
	
	/**
	 * @param idx: index of item to be removed
	 * @return the item at index idx from the stack. Assume that the index of the "bottom"
	 * item is 0, and the top item is size-1.
	 * return null if there is no item at passed index.
	 */
	public String get(int idx) {
		if(items[idx] == "" || items[idx] == null || items.length < 1) {
			return null;
		}
		return items[idx];
	}
	
	/**
	 * return a string representation of the stack.
	 * if the stack has items "Me" (at index 2), "fail" (at index 1), 
	 * "English" (at index 0), 
	 * the String returned should be "Me\nFail\nEnglish".
	 * Return "" if the stack is empty.
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
