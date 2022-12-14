package practicePackage._03_classesObjects.attempts;

public class CarTrip {
	public double distance, time; //in kms and hours respectively
	
	/**
	 * 
	 * @param d: value meant for distance
	 * @param t: value meant for time
	 * 
	 * assign the higher of 0 and d into distance
	 * assign the higher of 0 and t into time
	 */
	public CarTrip(double d, double t) {
		d = Math.max(0, d);
		t = Math.max(0, t);
		distance=d;
		time=t;
		//to be completed
	}
	
	public double averageSpeed() {
		return distance/time; //to be completed
	}
	
	/**
	 * return details in the format "distance kms travelled in time hours"
	 * For example, if distance = 2.5, time = 1.2, return "2.5 kms travelled in 1.2 hours" 
	 */
	public String toString() {
		return distance + " kms travelled in " + time + " hours"; //to be completed
	}
	
	/**
	 * 
	 * @param other
	 * @return 1 if calling object distance is more than parameter object distance
	 * -1 if calling object distance is less than parameter object distance
	 * 0 if calling object distance is equal to parameter object distance
	 */
	public int compareTo(CarTrip other) {
		if (this.distance > other.distance) {
			return 1;
		} 
		if (this.distance < other.distance) {
			return -1;
		}
		return 0; //to be completed
	}
}