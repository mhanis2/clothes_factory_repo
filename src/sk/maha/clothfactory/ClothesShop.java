package sk.maha.clothfactory;

public class ClothesShop {
	public static void main(String[] args) {

		ClothesFactory tShirtFactory = TShirtFactory.getInstanceOfTShirtFactory();
		ClothesFactory shirtFactory = ShirtFactory.getInstanceOfShirtFactory();
		ClothesFactory trousersFactory = TrousersFactory.getInstanceOfTrousersFactory();

		Clothes noColorTShirt = tShirtFactory.createClothes();
		Clothes noColorTShirt2 = tShirtFactory.createClothes();

		System.out.println("Tshirt:");
		System.out.println("noColorTShirt == noColorTShirt2 ? " + (noColorTShirt == noColorTShirt2));
		System.out.println("noColorTShirt.equals(noColorTShirt2) ? " + noColorTShirt.equals(noColorTShirt2));
		System.out.println();

		Clothes colorTrousers = trousersFactory.createClothes("green", 9);
		Clothes noColorTrousers = trousersFactory.createClothes();

		System.out.println("Trousers:");
		System.out.println("colorTrousers == noColorTrousers ? " + (colorTrousers == noColorTrousers));
		System.out.println("colorTrousers.equals(noColorTrousers) ? " + colorTrousers.equals(noColorTrousers));
		System.out.println("Size of colorTrousers is \"" + colorTrousers.getSize() + "\"" + " and color is \""
				+ colorTrousers.getColor() + ".\"");
		System.out.println("Size of noColorTrousers is \"" + noColorTrousers.getSize() + "\"" + " and color is \""
				+ noColorTrousers.getColor() + ".\"");
		System.out.println();


		Clothes colorShirt = shirtFactory.createClothes("yellow", 4);
		Clothes colorShirt2 = shirtFactory.createClothes("blue", 5);

		System.out.println("Shirt:");
		System.out.println("Size of colorShirt is \"" + colorShirt.getSize() + "\"" + " and color is \""
				+ colorShirt.getColor() + ".\"");
		System.out.println("Size of colorShirt2 is \"" + colorShirt2.getSize() + "\"" + " and color is \""
				+ colorShirt2.getColor() + ".\"");
		System.out.println("colorShirt == colorShirt2 ? " + (colorShirt == colorShirt2));
		System.out.println("colorShirt.equals(colorShirt2) ? " + colorShirt.equals(colorShirt2));

	}

}
