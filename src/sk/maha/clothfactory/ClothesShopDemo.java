package sk.maha.clothfactory;

import java.util.Scanner;

public class ClothesShopDemo {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ClothesShop2 shop = new ClothesShop2();

		ClothesFactory tShirtFactory = TShirtFactory.getInstanceOfTShirtFactory();
		ClothesFactory shirtFactory = ShirtFactory.getInstanceOfShirtFactory();
		ClothesFactory trousersFactory = TrousersFactory.getInstanceOfTrousersFactory();

		int choiceOfCategory;
		char choiceOfSubcategory;

		Clothes[] tshirtsWithColor = null;
		Clothes[] tshirtsWithoutColor = null;
		Clothes[] shirtsWithColor = null;
		Clothes[] shirtsWithoutColor = null;
		Clothes[] trousersWithColor = null;
		Clothes[] trousersWithoutColor = null;

		int[] numbersOfComparedPieces = null;

		boolean continueProgram;

		for (;;) {
			
			do {
				System.out.println("Welcome Dear Customer.");
				System.out.println("Which product do you want to buy?");
				System.out.println("1) Shirt\n2) Tshirt\n3) Trousers");
				System.out.println();
				System.out.print("Your choice: ");
				choiceOfCategory = sc.nextInt();
				System.out.println(choiceOfCategory);
			} while (choiceOfCategory < 1 || choiceOfCategory > 3);

			
			switch (choiceOfCategory) {

			
			case 1:
				choiceOfSubcategory = shop.choseSubcategoryClothes(sc);

				switch (choiceOfSubcategory) {

				
				case 'y':
					shirtsWithColor = shop.howManyPieces(shirtsWithColor, sc);

					System.out.println("You want to buy " + shirtsWithColor.length + " shirts.");
					System.out.println();

					shop.createInstancesWithSizeAndColor(shirtsWithColor, shirtFactory, sc, "Shirt");

					numbersOfComparedPieces = shop.setTwoObjectsToCompare("shirt", sc, shirtsWithColor);

					shop.resultOfCreationInstancesWithColorAndSize("shirt", "Shirt", numbersOfComparedPieces[0],
							numbersOfComparedPieces[1], shirtsWithColor);
					break;

				case 'n':
					shirtsWithoutColor = shop.howManyPieces(shirtsWithoutColor, sc);

					System.out.println("You want to buy " + shirtsWithoutColor.length + " shirts.");
					System.out.println();

					shop.createInstancesWithoutSizeAndColor(shirtsWithoutColor, shirtFactory, "Shirt");

					numbersOfComparedPieces = shop.setTwoObjectsToCompare("shirt", sc, shirtsWithoutColor);

					shop.resultOfCreationInstancesWithoutColorAndSize("shirt", "Shirt", numbersOfComparedPieces[0],
							numbersOfComparedPieces[1],
							tshirtsWithoutColor);
					break;
				}
				break;
			
			case 2:
				choiceOfSubcategory = shop.choseSubcategoryClothes(sc);

				switch (choiceOfSubcategory) {

				case 'y':
					tshirtsWithColor = shop.howManyPieces(tshirtsWithColor, sc);

					System.out.println("You want to buy " + tshirtsWithColor.length + " T-Shirts.");
					System.out.println();

					shop.createInstancesWithSizeAndColor(tshirtsWithColor, tShirtFactory, sc, "T-Shirt");

					numbersOfComparedPieces = shop.setTwoObjectsToCompare("T-Shirt", sc, tshirtsWithColor);


					shop.resultOfCreationInstancesWithColorAndSize("T-Shirt", "T-Shirt", numbersOfComparedPieces[0],
							numbersOfComparedPieces[1], tshirtsWithColor);
					break;

				case 'n':
					tshirtsWithoutColor = shop.howManyPieces(tshirtsWithoutColor, sc);

					System.out.println("You want to buy " + tshirtsWithoutColor.length + " T-Shirts.");
					System.out.println();

					shop.createInstancesWithoutSizeAndColor(tshirtsWithoutColor, tShirtFactory, "T-Shirt");

					numbersOfComparedPieces = shop.setTwoObjectsToCompare("T-Shirt", sc, tshirtsWithoutColor);

					shop.resultOfCreationInstancesWithoutColorAndSize("T-Shirt", "T-Shirt", numbersOfComparedPieces[0],
							numbersOfComparedPieces[1],
							tshirtsWithoutColor);
					break;
				}
				break;

			case 3:
				choiceOfSubcategory = shop.choseSubcategoryClothes(sc);

				switch (choiceOfSubcategory) {

				case 'y':
					trousersWithColor = shop.howManyPieces(trousersWithColor, sc);

					System.out.println("You want to buy " + trousersWithColor.length + " pairs of trousers.");
					System.out.println();

					shop.createInstancesWithSizeAndColor(trousersWithColor, trousersFactory, sc, "Trousers");


					numbersOfComparedPieces = shop.setTwoObjectsToCompare("trousers", sc, trousersWithColor);

					shop.resultOfCreationInstancesWithColorAndSize("trousers", "Trousers", numbersOfComparedPieces[0],
							numbersOfComparedPieces[1], trousersWithColor);
					break;

				case 'n':
					trousersWithoutColor = shop.howManyPieces(trousersWithoutColor, sc);

					System.out.println("You want to buy " + trousersWithoutColor.length + " pieses.");
					System.out.println();

					shop.createInstancesWithoutSizeAndColor(trousersWithoutColor, trousersFactory, "Trousers");

					numbersOfComparedPieces = shop.setTwoObjectsToCompare("trousers", sc, trousersWithoutColor);

					shop.resultOfCreationInstancesWithoutColorAndSize("trousers", "Trousers",
							numbersOfComparedPieces[0], numbersOfComparedPieces[1],
							trousersWithoutColor);
					break;
				}
				break;
			}

			continueProgram = shop.continueProgram(sc);
			if (!continueProgram) {
				System.out.println();
				System.out.println("End of program !!!");
				sc.close();
				break;
			}

		}

	}


}
