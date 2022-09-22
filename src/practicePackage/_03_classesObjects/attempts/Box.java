package practicePackage._03_classesObjects.attempts;

/**
 * 
 * @author gauravgupta Box represents a three dimensional cuboid. We use the
 *         front perspective such that the side from front to back is depth the
 *         side from top to bottom is height the side from left to right is
 *         width
 * 
 *         IMPORTANT: Do NOT override equals()
 */
public class Box {
	public int depth, height, width;

	/**
	 * 
	 * NOTE: if any of the values are less than 1, they should be made 1 before
	 * copying into corresponding instance variable
	 * 
	 * @param d (for depth)
	 * @param h (for height)
	 * @param w (for width)
	 */
	public Box(int d, int h, int w) {
		if (depth < 1) {
			depth = 1;
		}
		depth = d;

		if (height < 1) {
			height = 1;
		}
		height = h;

		if (width < 1) {
			width = 1;
		}
		width = w;

	}

	/**
	 * copy constructor to create an instance copy of the passed object
	 * 
	 * @param original
	 */
	public Box(Box original) {
		width = original.width;
		height = original.height;
		depth = original.depth;
	}

	/**
	 * @return String representation. for example, if depth = 3, height = 2, width =
	 *         5, it should return "3 x 2 x 5"
	 */
	public String toString() {
		return depth + " x " + height + " x " + width;
	}

	/**
	 * 
	 * @return the volume of the box
	 */
	public int volume() {
		return width * height * depth;
	}

	/**
	 * 
	 * @return the longest side of the box
	 */
	public int longestSide() {

		if (depth > height && depth > width)
			return depth;
		else if (height > depth && height > width)
			return height;
		else
			return width;
	}

	/**
	 *
	 * @return area of the base (or the top)
	 */
	public int baseArea() {
		return width * depth;
	}

	/**
	 * 
	 * @return area of the front (or the back face)
	 */
	public int frontArea() {
		return width * height;
	}

	/**
	 * 
	 * @return area of the left (or right) face
	 */
	public int sideArea() {
		return height * depth;
	}

	/**
	 * 
	 * @return the surface area of the box
	 */
	public int surfaceArea() {
		return this.baseArea() + this.baseArea() + this.frontArea() + this.frontArea() + this.sideArea()
				+ this.sideArea();
	}

	/**
	 * 
	 * @return the area of the largest surface (base/front/side)
	 */
	public int largestFaceArea() {
		if (this.baseArea() > this.frontArea() && this.baseArea() > this.sideArea())
			return this.baseArea();
		else if (this.frontArea() > this.baseArea() && this.frontArea() > this.sideArea())
			return this.frontArea();
		else
			return this.sideArea();

	}

	/**
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object -1 if calling
	 *         object is "less than" parameter object 0 if calling object is "equal
	 *         to" parameter object comparison criteria: volume -> surface area
	 *
	 */
	public int compareTo(Box other) { // volume -> surface area
		if (this.surfaceArea() > other.surfaceArea()) {
			return 1;
		}

		if (this.surfaceArea() < other.surfaceArea()) {
			return -1;
		}
		return 0;
	}

	/**
	 * D
	 * 
	 * @param b
	 * @return true if the box represented by the calling object can fit inside the
	 *         box represented by the parameter object, false otherwise. Note that a
	 *         box cannot fit inside the box of the same dimension.
	 */
	public boolean canFitInside(Box b) {
			return false;
	}

	/**
	 * D
	 * 
	 * @param other
	 * @return true if the calling object is identical to the parameter object when
	 *         orientation is not considered. so 3 x 2 x 5 and 5 x 2 x 3 are
	 *         identical.
	 */
	public boolean isIdenticalTo(Box other) {
		return true;
	}

	/**
	 * HD
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object -1 if calling
	 *         object is "less than" parameter object 0 if calling object is "equal
	 *         to" parameter object comparison criteria: volume -> surface area ->
	 *         longest sides -> second longest sides -> shortest side
	 */
	public int compareToAdvanced(Box other) {
		return 0;
	}
}
