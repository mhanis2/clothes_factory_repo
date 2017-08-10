package sk.maha.clothfactory;

import java.util.Scanner;

public class ClothesShop2 {

	/**
	 * Choose to create piece(s) of clothes with or without color and size.
	 * 
	 * @param s
	 * @return Subcategory of clothes
	 */
	public char choseSubcategoryClothes(Scanner s) {
		char choiceOfSubcategory;
		do {
			System.out.println("Do you want to set size and color?");
			System.out.println("Yes = 'y', No = 'n'");
			System.out.print("Your choice: ");
			choiceOfSubcategory = s.next().charAt(0);
		} while (choiceOfSubcategory != 'y' && choiceOfSubcategory != 'n');
		return choiceOfSubcategory;
	}

	/**
	 * Set color for clothes.
	 * 
	 * @param kindOfClothes
	 * @param s
	 * @return Color of cloth
	 */
	public String choseColorClothes(Scanner s) {
		String color;
		System.out.print("Which color do you want: ");
		color = s.next();
		return color;
	}

	/**
	 * Set size of clothes.
	 * 
	 * @param kindOfClothes
	 * @param s
	 * @return Size of cloth
	 */
	public int choseSizeClothes(Scanner s) {
		int size;
		System.out.print("Which size do you want: ");
		size = s.nextInt();
		return size;
	}

	/**
	 * Set how many pieces of clothes to create.
	 * 
	 * @param x
	 * @param s
	 * @return Amount of clothes
	 */
	public Clothes[] howManyPieces(Clothes[] x, Scanner s) {
		int amount;
		System.out.println("How many pieces: ");
		amount = s.nextInt();
		x = new Clothes[amount];
		return x;

	}

	/**
	 * End program or continue with program.
	 * 
	 * @param s
	 * @return Answer of user to end or continue with program
	 */
	public boolean continueProgram(Scanner s) {
		char answer;
		do {
			System.out.print("Do you want to continue? (y/n): ");
			answer = s.next().charAt(0);
		} while (answer != 'y' && answer != 'n');

		return (answer == 'y') ? true : false;
	}

	/**
	 * Create clothes without color and size.
	 * 
	 * @param c
	 * @param f
	 * @param str
	 */
	public void createInstancesWithoutSizeAndColor(Clothes[] c, ClothesFactory f, String str) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(str + (i + 1) + ":");
			c[i] = f.createClothes();
			System.out.println();
		}
	}

	/**
	 * Create clothes with color and size.
	 * 
	 * @param c
	 * @param f
	 * @param s
	 * @param str
	 */
	public void createInstancesWithSizeAndColor(Clothes[] c, ClothesFactory f, Scanner s, String str) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(str + (i + 1) + ":");
			c[i] = f.createClothes(choseColorClothes(s), choseSizeClothes(s));
			System.out.println();
		}
	}

	/**
	 * Print results of creation of instances with color and size and compare
	 * them.
	 * 
	 * @param str
	 * @param strUppercase
	 * @param first
	 * @param second
	 * @param c
	 */
	public void resultOfCreationInstancesWithColorAndSize(String str, String strUppercase, int first, int second, Clothes[] c) {
		System.out.println(strUppercase + ":");
		System.out.println("Size of color " + str + "1 is \"" + c[first - 1].getSize() + "\"" + " and color is \""
				+ c[first - 1].getColor() + ".\"");
		System.out.println("Size of color " + str + "2 is \"" + c[second - 1].getSize() + "\"" + " and color is \""
				+ c[second - 1].getColor() + ".\"");
		System.out.println("color " + str + "1 == color " + str + "2 ? " + (c[first - 1] == c[second - 1]));
		System.out.println("color " + str + "1.equals(color " + str + "2) ? " + c[first - 1].equals(c[second - 1]));
	}
	
	/**
	 * Print results of creation of instances without color and size and compare
	 * them.
	 * 
	 * @param str
	 * @param first
	 * @param second
	 * @param c
	 */
	public void resultOfCreationInstancesWithoutColorAndSize(String str, String strUppercase, int first, int second,
			Clothes[] c) {
		System.out.println(strUppercase + ":");
		System.out.println(str + "1 == " + str + "2 ? " + (c[first - 1] == c[second - 1]));
		System.out.println(str + "1.equals(" + str + "2) ? " + c[first - 1].equals(c[second - 1]));
	}

	/**
	 * Set which object of array user wants to compare.
	 * 
	 * @param str
	 * @param s
	 * @param c
	 * @return Objects to compare
	 */
	public int[] setTwoObjectsToCompare(String str, Scanner s, Clothes[] c) {
		int firstPiece;
		int secondPiece;
		int[] numbersArray = new int[2];
		System.out.println("Which " + str + " of " + c.length + " pieces do you want to compare?");
		System.out.print("First " + str + ": ");
		firstPiece = s.nextInt();
		numbersArray[0] = firstPiece;
		System.out.print("Second " + str + ": ");
		secondPiece = s.nextInt();
		numbersArray[1] = secondPiece;
		return numbersArray;
	}
}
