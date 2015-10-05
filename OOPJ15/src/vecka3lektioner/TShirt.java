package vecka3lektioner;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Test class for JavaDoc
 * @author borgs_000
 * @version 1.0
 * 
 *
 */

public class TShirt {
	private int size;
	/**
	 * Crates a new t-shirt  with a size
	 * @param size in cm
	 */
	TShirt(int size)
	{
		this.size = size;
	}
/**
 * 
 * @return size in cm
 */
	public int getSize() {
		return size;
	}
	/**
	 * Sets the size of tshirt
	 * @param size in cm
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * reader for a text file
	 * @param reader Reader for textfile
	 * @return price of tshirt in dollars as a float
	 * @throws IOException if connection to reader is lost
	 * @see IOException
	 */
	public float findPrice(BufferedReader reader) throws IOException
	{
		String price = null;
		price = reader.readLine();
		return Float.parseFloat(price);
	}

}
