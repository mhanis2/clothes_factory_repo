package sk.maha.clothfactory;

public class TrousersFactory implements ClothesFactory {

	private static TrousersFactory TROUSERSFACTORY;

	private TrousersFactory() {

	}

	/**
	 * Creation of one instance of TrousersFactory.
	 * 
	 * @return TrousersFactory instance
	 */
	public static TrousersFactory getInstanceOfTrousersFactory() {
		if (TROUSERSFACTORY == null) {
			TROUSERSFACTORY = new TrousersFactory();
		}

		return TROUSERSFACTORY;
	}

	@Override
	public Clothes createClothes(String color, int size) {
		Clothes NewTrousers = new Trousers();
		NewTrousers.setColor(color);
		NewTrousers.setSize(size);
		return NewTrousers;
	}

	@Override
	public Clothes createClothes() {
		return new Trousers();
	}

}
