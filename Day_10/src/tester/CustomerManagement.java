package tester;

import java.util.Collections;
import java.util.Iterator;

//import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;

import custom_exceptions.CustomerInvalidException;

import static utils.CustomerUtils.*;
import static utils.CustomerValidationRules.validateAllInputs;
import custom_ordering.CustomeDobAndLastNameComparator;

/*
 * Customer management system Supply 
 * Options 
 * 1. Sign up (customer registration)//first check duplication and then add to list
 * 2. Sign in (login) // findByEmail check email id and password
 * i/p : email n password 
 * 3. Change password //findByEmail check email id, password and then setPassword 
 * i/p : email n old password n new password 
 * 4. Unsubscribe customer //remove customer by email i/p : customer email 
 * 5. Display all customers. //for each loop 
 * 0. Exit
 */

public class CustomerManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//			List<Customer> customerList = new ArrayList<>();
			List<Customer> customerList = generateDummyCustomers();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options:\n 1. Sign up \n 2. Sign in \n 3. Change password \n 4. Unsubscribe customer \n 5. Display all customers. \n 6. Sort customer details as per email \n 7. Sort customer details as per dob n last name \n 8. Remove all those customer details whose subscription is pending for last 6 months \n 9. display complete names of the customers , who have not paid the subscription (reg amount) , for last 3 months \n 0.Exit \n");
				System.out.println("Choose an option");

				try {
					switch (sc.nextInt()) {
					case 1:
//						first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
						/*
						 * System.out.println(
						 * "Enter customer details:\n first name, last name, email, password, registrationAmount, dob, plan"
						 * );
						 */
						System.out.print("Enter First Name: ");
						String firstName = sc.next();
						System.out.print("Enter Last Name: ");
						String lastName = sc.next();
						System.out.print("Enter Email: ");
						String email = sc.next();
						System.out.print("Enter Password: ");
						String password = sc.next();
						System.out.print("Enter Registration Amount: ");
						double registrationAmount = sc.nextDouble();
						System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
						String dob = sc.next();
						System.out.print("Enter Date of registration (YYYY-MM-DD): ");
						String regDate = sc.next();
						System.out.println("Enter Plan: ");
						String plan = sc.next();

						Customer customer = validateAllInputs(firstName, lastName, email, password, registrationAmount,
								dob,regDate, plan, customerList);
						customerList.add(customer);
						System.out.println("added new customer");
						break;
					case 2:
						// sign in
						System.out.print("Enter Email: ");
						String signInEmail = sc.next();
						System.out.print("Enter Password: ");
						String signInPassword = sc.next();
						System.out.println(authenticateCustomer(signInEmail, signInPassword, customerList));
						break;
					case 3:
						// change password
						System.out.print("Enter Email: ");
						email = sc.next();
						System.out.print("Enter old Password: ");
						String oldPassword = sc.next();
						System.out.print("Enter old Password: ");
						String newPassword = sc.next();
						changePassword(email, oldPassword, newPassword, customerList);
						break;
					case 4:
						// unsubscribe customer
						System.out.println("Enter email id: ");
						Customer c = new Customer(sc.next());
						boolean removed = customerList.remove(c);
						if (!removed) {
							throw new CustomerInvalidException("Invalid email id: customer can't be deleted!");
						}
						System.out.println("Unsubscribed successfully....");
						break;
					case 5:
						// display all customers
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
						break;
					case 6:
						//Sort customer details as per email
						Collections.sort(customerList);
						System.out.println("Sorted customer details as per asc email");
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
						break;
					case 7:
						//Sort customer details as per dob n last name
						Collections.sort(customerList, new CustomeDobAndLastNameComparator());
						System.out.println("Sorted customer details as per asc dob and last name");
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
						break;
					case 8:
						//remove
						Iterator<Customer> itr=customerList.iterator();
						while(itr.hasNext()) {
							customer=itr.next();
							if(getNoOfMonthsCustomerHaveNotPaidSubscription(customer.getLastSubscriptionPaidDate())>9) {
								itr.remove();
							}
						}
						break;
					case 9:
						//not paid for last 3 month
						for(Customer cust: customerList) {
							if(getNoOfMonthsCustomerHaveNotPaidSubscription(cust.getLastSubscriptionPaidDate())>3) {
								System.out.println(cust);
							}
						}
						break;
					case 0:
						exit = true;
						break;
					}

				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}

		}

	}

}
