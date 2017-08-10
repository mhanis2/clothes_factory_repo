package sk.maha.clothfactory;

/**
 * Interface for initialize clothes
 * 
 * @author Marcel
 *
 */

public interface Clothes {

	/**
	 * Get a size of one piece of clothes.
	 * 
	 * @return Size of clothes
	 */
	public int getSize();

	/**
	 * Get the color of one piece of clothes.
	 * 
	 * @return Color of clothes
	 */

	public String getColor();

	/**
	 * Set size of one piece of clothes.
	 * 
	 * @param size
	 */
	public void setSize(int size);

	/**
	 * Set color of one piece of clothes.
	 * 
	 * @param color
	 */
	public void setColor(String color);
}
