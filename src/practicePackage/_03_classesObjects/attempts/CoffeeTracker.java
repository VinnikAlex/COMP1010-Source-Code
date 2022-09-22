package practicePackage._03_classesObjects.attempts;

public class CoffeeTracker {
	public int[] coffeesPerDay;

	/**
	 * create an instance copy of data into coffeesPerDay. The two objects, data and
	 * coffeesPerDay, should have the same values but NOT refer to the same
	 * instance.
	 * 
	 * @param data (you may assume data.length > 0)
	 */
	public CoffeeTracker(int[] data) {
		coffeesPerDay = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			coffeesPerDay[i] = data[i];
		}
		// to be completed
	}

	public int coffeesConsumed() {
		int consumed = 0;
		for (int i = 0; i < coffeesPerDay.length; i++) {
			consumed += coffeesPerDay[i];
		}

		return consumed;
	}

	public double averageCoffeesConsumed() {
		double consumed = 0;
		double instances = 0;
		
		for (int i = 0; i < coffeesPerDay.length; i++) {
			consumed += coffeesPerDay[i];
			instances++;
		}

		return consumed / instances;
	}

	public int coffeeFreeDays() {
		int consumed = 0;

		for (int i = 0; i < coffeesPerDay.length; i++) {
			if(coffeesPerDay[i] == 0)
			consumed++;
		}
		return consumed;
	}
}
