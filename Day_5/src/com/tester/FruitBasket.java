package com.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of fruits in the basket");
		Fruit[] basket = new Fruit[sc.nextInt()];

		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("choose from the following options: \n 1. Add Mango \n" + "2. Add Orange \n"
					+ "3. Add Apple \n" + "4. Display names of all fruits in the basket. \n"
					+ "5. Display name,color,weight, taste of all fresh fruits , in the basket. \n "
					+ "6. Mark a fruit in a basket , as stale \n" + "8. Invoke fruit specific functionality \n " +"7. Mark all sour fruits stale  "+ "0.exit");

			switch (sc.nextInt()) {
			case 1:
				if (counter < basket.length) {
					basket[counter++] = new Mango("Yellow", 1, "Mango", true);
				} else {
					System.out.println("full");
				}

				break;

			case 2:
				if (counter < basket.length) {
					basket[counter++] = new Orange("Orange", 1, "Orange", false);
				} else {
					System.out.println("full");
				}

				break;

			case 3:
				if (counter < basket.length) {
					basket[counter++] = new Apple("Red", 1, "Apple", true);
				} else {
					System.out.println("full");
				}

				break;

			case 4:
				for (Fruit i : basket) {
					System.out.println(i.getName());
				}
				break;

			case 5:
				for (Fruit i : basket) {
					if (i.isFresh()) {
						System.out.println(i + " " + i.taste());
					}
				}
				break;

			case 6:
				System.out.println("Enter index of fruit to be marked stale");
				int index = sc.nextInt();
				if (index >= 0 && index < counter) {
					basket[index].setFresh(false);
					System.out.println(basket[index].getName() + " successfully marked stale");
				} else {
					System.out.println("invalid index");
				}
				break;
				
			case 7:
				for (int i = 0; i < counter; i++) {
					if (basket[i] instanceof Orange && "sour".equals(basket[i].taste())) {
					basket[i].setFresh(false);
				}
				}
				System.out.println("Marked all sour fruits as stale.");
				break;

			case 8:
				System.out.println("Enter index no");
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					// => seat no valid
					Fruit fruit = basket[index];
					if (fruit instanceof Apple)
						((Apple) fruit).jam();
					else if (fruit instanceof Mango)
						((Mango) fruit).pulp();
					else
						((Orange) fruit).juice();

				} else
					System.out.println("Invalid Seat No!!!!!!!!!!!!!");

				break;
						
			case 0:
				exit = true;
				System.out.println("exited successfully");
				break;

			}
		}

		sc.close();
	}
}
