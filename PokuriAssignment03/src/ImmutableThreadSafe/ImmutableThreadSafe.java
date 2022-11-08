/**
 * 
 */
package ImmutableThreadSafe;

/**
 * @author S546647
 *
 * 
 */
public class ImmutableThreadSafe {
	private final int r;
	private final int g;
	private final int b;

	public ImmutableThreadSafe(int r, int g, int b) {

	checkRGBVals(r, g, b);

	this.r = r;
	this.g = g;
	this.b = b;
	}

	/**
	* returns color in an array of three ints: R, G, and B
	*/
	public int[] getColor() {

	int[] retVal = new int[3];
	retVal[0] = r;
	retVal[1] = g;
	retVal[2] = b;

	return retVal;
	}

	public ImmutableThreadSafe invert() {

		ImmutableThreadSafe retVal = new ImmutableThreadSafe(255 - r,
	255 - g, 255 - b);

	return retVal;
	}

	private static void checkRGBVals(int r, int g, int b) {

	if (r < 0 || r > 255 || g < 0 || g > 255 ||
	b < 0 || b > 255) {

	throw new IllegalArgumentException();
	}
	}

}
