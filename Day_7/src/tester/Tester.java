package tester;

import java.util.Scanner;

import stackIf.Customer;
import stackIf.FixedStack;
import stackIf.GrowableStack;
import stackIf.Stack;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = null;

		boolean stackSelected = false;
		boolean exit = false;

		while (!exit) {
			System.out.println("Menu: ");
			System.out.println("1 -- Choose Fixed Stack");
			System.out.println("2 -- Choose Growable Stack");
			System.out.println("3 -- Push data");
			System.out.println("4 -- Pop data & display");
			System.out.println("5 -- Exit");

			switch (sc.nextInt()) {
			case 1:
				if (!stackSelected) {
					stack = new FixedStack();
					stackSelected = true;
				} else {
					System.out.println("You are not allowed to change selected stack");
				}
				break;
			case 2:
				if (!stackSelected) {
					stack = new GrowableStack();
					stackSelected = true;
				} else {
					System.out.println("You are not allowed to change selected stack");
				}
				break;

			case 3:
				if (stackSelected) {
					System.out.println("Enter following details:");
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter address");
					String address = sc.next();
					Customer c = new Customer(id, name, address);
					stack.push(c);
				} else {
					System.out.println("NO stack chosen !!!");
				}
				break;
			case 4:
				Customer customerPopped = stack.pop();
				if (stackSelected) {
					if (customerPopped != null)
						System.out.println("Popped customer details: " + customerPopped);
				} else {
					System.out.println("NO stack chosen !!!");
				}
				break;
			case 5:
				exit = true;
				System.out.println("Exited Successfully!!!");
				break;
			default:
				System.out.println("Please enter valid choice.");
			}
		}
		sc.close();

	}

}
