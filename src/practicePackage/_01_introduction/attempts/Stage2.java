// Cannot use Math library functions for any task

package practicePackage._01_introduction.attempts;

public class Stage2 {
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static boolean twoOutOfThree(int a, int b, int c) {
		
		return (a==b || a==c || c==a || c==b);
		
	} 

	/**
	 * 
	 * @param n (n could be positive, negative or zero)
	 * @return the last digit of the number
	 * For example,
	 * lastDigit(15) = 5
	 * lastDigit(-15) = 5
	 * lastDigit(0) = 0
	 * lastDigit(8) = 8
	 */
	public static int lastDigit(int n) {
		
		if (n < 0) {
			int a = n - n * 2;
			return a % 10;
		} else {
			return n % 10;
		}
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return the average of the two integers passed.
	 * for example,
	 * average(5, 9) = 7 (or 7.0)
	 * average(5, 8) = 6.5
	 */
	public static double average(int a, int b) {
		double addition = a + b;
		return addition / 2;
		//to be completed
	}

	/**
	 * 
	 * @param n
	 * @return the absolute value for n.
	 * absolute value is defined as the number without the negative sign, if any
	 * For example, absolute(-6) = 6, absolute(9) = 9
	 */
	public static int absolute(int n) {
	if (n < 0) {
		return n - n * 2;
	} else {
		return n;
	}
		//to be completed
	}

	/**
	 * 
	 * @param val
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return value val constrained between low and high.
	 * that is,
	 * 
	 * if val is less than low, return low
	 * if val is more than high, return high
	 * in all other cases, return val
	 */
	public static int constrain(int val, int low, int high) {
		if (val < low) {
			return low;//to be completed
		} else if (val > high) {
			return high;
		} else {
			return val;
		}
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return the quadrant in which coordinate (x, y) exists
	 * quadrant 1: non-negative x, non-negative y
	 * quadrant 2: negative x, non-negative y
	 * quadrant 3: negative x, negative y
	 * quadrant 4: non-negative x, negative y
	 * 
	 */
	public static int getQuadrant(int x, int y) {
		if (x >= 0 && y >= 0) {
			return 1;//to be completed
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else {
			return 4;
		}
	}

	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOff(double val) {
		int someInt = (int) (val + 0.5);
		return someInt;//to be completed
	}

	/**
	 * @param val (assume val is more than or equal to zero)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floor(4.2) = 4, floor(7.0) = 7, floor(5.9999) = 5
	 */
	public static int floor(double val) {
		return (int) val; //to be completed
	}

	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceiling(double val) {
		int floorVal = (int) val;
		
		if (val != floorVal && val >= 0) {
			floorVal += 1;
		} else if (val != floorVal && val < 0) {
			floorVal -= 1;
		} else if (val == floorVal) {
			val = floorVal;
		}
		 return floorVal;
		//to be completed
	}
	
	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the last character in the String
	 */
	public static char getLastChar(String str) {
		return str.charAt(str.length() - 1); //'a' used as default value (to be completed)
	}
	
	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the String with the first character removed
	 */
	public static String getWithoutFirstChar(String str) {
		return str.substring(1, str.length()); //to be completed
	}
	
	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the String with the last character removed
	 */
	public static String getWithoutLastChar(String str) {
		return str.substring(0, str.length() - 1); //to be completed
	}
}
