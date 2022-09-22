package practicePackage._05_arrayList.attempts;

import java.util.ArrayList;

import serviceClasses.MathService;
import serviceClasses.Rectangle;

@SuppressWarnings("unused")
public class Stage3 {
	/**
	 * 
	 * @param list
	 * @param target
	 * @return the SECOND index at which target exists in the list passed. return -1
	 *         if list is null or target doesn't exist TWICE in the list.
	 */
	public static int secondIndexOf(ArrayList<Integer> list, int target) {
		if (list == null) {
			return -1;
		}

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				count++;
				if (list.get(i) == target && count == 2) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @return the SECOND-LAST index at which target exists in the list passed.
	 *         return -1 if list is null or target doesn't exist TWICE in the list.
	 */
	public static int secondLastIndexOf(ArrayList<Integer> list, int target) {
		if (list == null) {
			return -1;
		}

		int count = 0;

		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) == target) {
				count++;
				if (list.get(i) == target && count == 2) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param list
	 * @return a list containing all the positive items from the list passed. return
	 *         null if list is null
	 */
	public static ArrayList<Integer> getPositives(ArrayList<Integer> list) {
		if (list == null) {
			return null;
		}
		
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (Integer item : list) {
			if (item > 0) {
				newList.add(item);
			}
		}
		return newList;
	}

	/**
	 * Remove all negative items from the list
	 * 
	 * @param list
	 * 
	 *             For example,
	 * 
	 *             if list = [2, 4, 0, -1, -2, -3, 0, 4, -8, 3, 0, -1, -1], it
	 *             should become [2, 4, 0, 0, 4, 3, 0]
	 * 
	 *             TIP: use remove method and use the debugger to ensure that the
	 *             right item is being removed
	 */
	public static void removeNegatives(ArrayList<Integer> list) {
		// to be completed
//		if (list == null) {
//			return;
//		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) < 0) {
				list.remove(i);
			}
		}
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains two instances of target in a row, false
	 *         otherwise. return false if list is null or if it contains less than 2
	 *         items
	 */
	public static boolean twoInARow(ArrayList<Integer> list, int target) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains three instances of target in a row, false
	 *         otherwise. return false if list is null or if it contains less than 3
	 *         items
	 */
	public static boolean threeInARow(ArrayList<Integer> list, int target) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the two lists contain the same items but in reverse order.
	 *         return false if EITHER list is null For example, a = [10,70,20,90],
	 *         b=[90,20,70,10], return true a = [10,70,20,90], b=[90,20,70], return
	 *         false a = [10,70,20,90], b=[90,70,20,10], return false a =
	 *         [10,70,20], b=[90,20,70,10], return false a = null, b =
	 *         [90,20,70,10], return false
	 */
	public static boolean mutuallyReverse(ArrayList<Integer> a, ArrayList<Integer> b) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if every item in the list occurs only once, false otherwise.
	 *         return true if list is empty, false if the list is null
	 * 
	 *         TIP: use of methods indexOf and lastIndexOf will make your life
	 *         oh-so-easy
	 */
	public static boolean allUnique(ArrayList<Integer> list) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param widths:  if not null, assume it has same number of items as heights
	 * @param heights: if not null, assume it has same number of items as widths
	 * @return an ArrayList of Rectangle objects such that rectangle at index i has
	 *         a width of widths.get(i) and height of heights.get(i)
	 * 
	 *         return null if either of the parameter lists is null
	 */
	public static ArrayList<Rectangle> getRectangles(ArrayList<Integer> widths, ArrayList<Integer> heights) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param n
	 * @param init
	 * @param inc
	 * @return an list containing n items such that the first item is init, and each
	 *         item is inc more than the previous item. return null if n is less
	 *         than 0
	 * 
	 *         NOTE 1: take special care when n = 0, the method should return the
	 *         list {} NOTE 2: inc can be negative too :)
	 */
	public static ArrayList<Integer> generatePatternedArray(int n, int init, int inc) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return number of items that exist exactly once in the list passed
	 */
	public static int countUniqueItems(ArrayList<Integer> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items in the same order, false
	 *         otherwise return false if either of list passed is null
	 */
	public static boolean identical(ArrayList<Integer> a, ArrayList<Integer> b) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a contains all the items in b, false otherwise return false
	 *         if either of list passed is null
	 */
	public static boolean contains(ArrayList<Integer> a, ArrayList<Integer> b) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items but not necessarily in the same
	 *         order, false otherwise return false if either of list passed is null
	 */
	public static boolean same(ArrayList<Integer> a, ArrayList<Integer> b) {
		return false; // to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return a new list where all items of a are followed by all items of b,
	 *         return null if either of the list passed is null
	 */
	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param n
	 * @return an list containing items {1, 2, ..., n-1, n} return null if n is less
	 *         than 0
	 */
	public static ArrayList<Integer> generate(int n) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the reverse of list, return null if list passed is null, return empty
	 *         list if list passed is empty
	 */
	public static ArrayList<Integer> getReverse(ArrayList<Integer> list) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return an list containing the numbers of occurrences of all distinct items
	 *         in list return null if the list is null.
	 */
	public static ArrayList<ArrayList<Integer>> getFrequencyTable(ArrayList<Integer> list) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the item that appears least in the list, or the first item that does
	 *         so in case of a tie. You may assume that list passed is NOT null
	 */
	public static int getLeastFrequentItem(ArrayList<Integer> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the item that appears most in the list, or the first item that does
	 *         so in case of a tie You may assume that list passed is NOT null
	 */
	public static int getMostFrequentItem(ArrayList<Integer> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @param start
	 * @return a sublist of list from index start (inclusive) to the end of the
	 *         list, return null if list is null or empty or start is invalid
	 */
	public static ArrayList<Integer> sublistFromIndex(ArrayList<Integer> list, int start) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @param end
	 * @return a sublist of list from the start of the list to index end
	 *         (inclusive), return null if list is null or empty or end is invalid
	 */
	public static ArrayList<Integer> sublistUptoIndex(ArrayList<Integer> list, int end) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @param start
	 * @param end
	 * @return a sublist of list from index start to index end (inclusive), return
	 *         null if - list is null or empty, or, - start and/or end is invalid,
	 *         or, - start is more than end
	 */
	public static ArrayList<Integer> sublist(ArrayList<Integer> list, int start, int end) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all negative items of list, return null if list
	 *         passed is null, return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getNegatives(ArrayList<Integer> list) {
		if (list == null) {
			return null;
		}
		
		if(list.isEmpty()) {
			return list;
		}
		
		ArrayList<Integer> Neg = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < 0) {
				Neg.add(list.get(i));
			}
		}
		return Neg;
		
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all non-zero items of list, return null if list
	 *         passed is null, return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getNonZeroes(ArrayList<Integer> list) {
		if (list == null) {
			return null;
		}
		
		if(list.isEmpty()) {
			return list;
		}
		
		ArrayList<Integer> noZero = new ArrayList<Integer>();

		for(int i=0; i<list.size(); i++) {
			if(list.get(i) != 0) {
				noZero.add(list.get(i));
			}
		}
		return noZero;
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all items of list that are prime numbers, return
	 *         null if list passed is null, return an empty list if list passed is
	 *         empty
	 * 
	 *         TIP: Use isPrime from MathService class as:
	 *         MathService.isPrime(number to check)
	 */
	public static ArrayList<Integer> getPrimes(ArrayList<Integer> list) {
		if (list == null) {
			return null;
		}
		
		if(list.isEmpty()) {
			return list;
		}
		
		ArrayList<Integer> listPrimes = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(MathService.isPrime(list.get(i))){
				listPrimes.add(list.get(i));
			}
		}
		return listPrimes;
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all non-negative items of list, return null if
	 *         list passed is null, return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getWithoutNegatives(ArrayList<Integer> list) {
		if (list == null) {
			return null;
		}
		
		if(list.isEmpty()) {
			return list;
		}
		
		ArrayList<Integer> noNegs = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) >= 0) {
				noNegs.add(list.get(i));
			}
		}
		return noNegs;
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all non-positive items of list, return null if
	 *         list passed is null, return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getWithoutPositives(ArrayList<Integer> list) {
		if (list == null) {
			return null;
		}
		
		if(list.isEmpty()) {
			return list;
		}
		
		ArrayList<Integer> onlyNegs = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) <= 0) {
				onlyNegs.add(list.get(i));
			}
		}
		return onlyNegs;
	}

	/**
	 * 
	 * @param list
	 * @return a new list where only unique items are included, return null if list
	 *         passed is null, return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getUniqueItems(ArrayList<Integer> list) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return a copy of the list passed as parameter (not the same reference),
	 *         return null if list passed is null, return an empty list if list
	 *         passed is empty
	 * 
	 *         TIP: use method getCopy from Stage2
	 */
	public static ArrayList<ArrayList<Integer>> getCopy(ArrayList<ArrayList<Integer>> list) {
		return null; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @param sub
	 * @return the first index at which sub starts in list return -1 if sub has a
	 *         higher length than list or there is no such sub found in list
	 */
	public static int indexOf(ArrayList<Integer> list, ArrayList<Integer> sub) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list
	 * @param sub
	 * @return the last index at which sub starts in list return -1 if sub has a
	 *         higher length than list or there is no such sub found in list
	 */
	public static int lastIndexOf(ArrayList<Integer> list, ArrayList<Integer> sub) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of items in non-null sublists of list, return 0 if
	 *         list is null or empty
	 */
	public static int totalNumberOfItems(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of even items in non-null sublists of list, return 0
	 *         if list is null or empty
	 */
	public static int totalNumberOfEvenItems(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of odd items in non-null sublists of list, return 0
	 *         if list is null or empty
	 */
	public static int totalNumberOfOddItems(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of positive items in non-null sublists of list,
	 *         return 0 if list is null or empty
	 */
	public static int totalNumberOfPositiveItems(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of negative items in non-null sublists of list,
	 *         return 0 if list is null or empty
	 */
	public static int totalNumberOfNegativeItems(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of unique items (items existing only once) within a
	 *         non-null sublist of list, return 0 if list is null or empty
	 */
	public static int totalNumberOfUniqueItems(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the number of null sublists in list, return 0 if list is null or
	 *         empty
	 */
	public static int countNullSublists(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the number of non-null sublists in list, return 0 if list is null or
	 *         empty
	 */
	public static int countNonNullSublists(ArrayList<ArrayList<Integer>> list) {
		return 0; // to be completed
	}
}
