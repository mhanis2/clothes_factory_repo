package sk.maha.clothfactory;

/**
 * Interface for making clothes
 * 
 * @author Marcel
 *
 */
public interface ClothesFactory {

	/**
	 * Creation one piece of clothes without parameters.
	 * 
	 * @return Clothes without color and size
	 */
	public Clothes createClothes();

	/**
	 * Creation one piece of clothes with parameters of color and size.
	 * 
	 * @return Clothes with color and size
	 */
	public Clothes createClothes(String color, int size);

}
