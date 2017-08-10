package sk.maha.clothfactory;

public class TShirtFactory implements ClothesFactory {

	private static TShirtFactory TSHIRTFACTORY;

	private TShirtFactory() {

	}

	/**
	 * Creation of one instance of TShirtFactory.
	 * 
	 * @return TShirtFactory instance
	 */
	public static TShirtFactory getInstanceOfTShirtFactory() {
		if (TSHIRTFACTORY == null) {
			TSHIRTFACTORY = new TShirtFactory();
		}

		return TSHIRTFACTORY;
	}

	@Override
	public Clothes createClothes(String color, int size) {
		Clothes NewTShirt = new TShirt();
		NewTShirt.setColor(color);
		NewTShirt.setSize(size);
		return NewTShirt;
	}

	@Override
	public Clothes createClothes() {
		return new TShirt();
	}

}
