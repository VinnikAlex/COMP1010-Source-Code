package practicePackage._03_classesObjects.attempts;

import java.text.DecimalFormat;

/**
 * the class stores time in a 24-hour format. hour = 9, minute = 20 represents
 * the time 9:20 am hour = 17, minute = 35 represents the time 5:35 pm
 * 
 */
@SuppressWarnings("unused")
public class Time {
	public int hour, minute;

	// DEFAULT CONSTRUCTOR
	public Time() {
		// DO NOT MODIFY!!!!
	}

	/**
	 * constructor: assign the parameters to corresponding instance variables
	 * 
	 * @param h: value intended for hour hour should become 0 if h is less than 0
	 *           hour should become 23 if h is more than 23
	 * @param m: value intended for minute minute should become 0 if m is less than
	 *           0 minute should become 59 if m is more than 59
	 */
	public Time(int h, int m) {
		hour = h;
		if (hour > 23) {
			hour = 23;
		}
		if (hour < 0) {
			hour = 0;
		}
		minute = m;
		if (minute > 59) {
			minute = 59;
		}
		if (minute < 0) {
			minute = 0;
		}
	}

	/**
	 * return time in the form hh:mm if hour = 8, minute = 3, return "08:03" if hour
	 * = 16, minute = 9, return "16:09" if hour = 17, minute = 25, return "17:25"
	 * HINT: use string concatenation: "0" (String) + 5 (int) gives "05" (String)
	 * HINT 2: you can use DecimalFormat class
	 */
	public String toString() {

		if (minute < 10 && hour < 10) {
			return "0" + hour + ":" + "0" + minute;
		}
		if (hour < 10) {
			return "0" + hour + ":" + minute;
		}
		if (minute < 10) {
			return hour + ":" + "0" + minute;
		}

		return hour + ":" + minute;
	}

	/**
	 * @param other: object against which calling object should be compared
	 * @return 1 if calling object comes after parameter object -1 if calling object
	 *         comes before parameter object 0 if calling object and parameter
	 *         object are the same
	 */
	public int compareTo(Time other) {
//
//		if (this.hour == other.hour && this.minute == other.minute) {
//			return 0;
//		}
//
//		if (this.hour > other.hour) {
//				return 1;
//			}
			return -1;
	}

	/**
	 * EXTRA... no test provided for this method return time in the form hh:mm AM/PM
	 * if hour = 8, minute = 3, return "08:03 AM" if hour = 16, minute = 9, return
	 * "04:09 PM" if hour = 11, minute = 25, return "11:25"AM" HINT: use string
	 * concatenation: "0" (String) + 5 (int) gives "05" (String)
	 */
	public String toStringAMPM() {
		return null;
	}

	/**
	 * HD level no test provided for this method
	 * 
	 * @param other
	 * @return a time object representing calling object (Time) shifted by parameter
	 *         object
	 * 
	 *         for example, if calling object has hour = 12, minute = 27 and
	 *         parameter object has hour = 17, minute = 53
	 * 
	 *         the resulting time would be 29 hours 80 minutes, or, 30 hours 20
	 *         minutes, or,
	 * 
	 *         But since it's a 24-hour time,
	 * 
	 *         you should return a Time object representing the time 6 hours 20
	 *         minutes (hint: 30 % 24 = 6)
	 * 
	 * 
	 */
	public Time shift(Time other) {
		return null;
	}
}
