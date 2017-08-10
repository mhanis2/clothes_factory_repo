package sk.maha.clothfactory;

public class ShirtFactory implements ClothesFactory {

	private static ShirtFactory SHIRTFACTORY;

	private ShirtFactory() {

	}

	/**
	 * Creation of one instance of ShirtFactory.
	 * 
	 * @return ShirtFactory instance
	 */
	public static ShirtFactory getInstanceOfShirtFactory() {
		if (SHIRTFACTORY == null) {
			SHIRTFACTORY = new ShirtFactory();
		}

		return SHIRTFACTORY;
	}

	@Override
	public Clothes createClothes(String color, int size) {
		Clothes NewShirt = new Shirt();
		NewShirt.setSize(size);
		NewShirt.setColor(color);
		return NewShirt;
	}

	@Override
	public Clothes createClothes() {
		return new Shirt();
	}
}
