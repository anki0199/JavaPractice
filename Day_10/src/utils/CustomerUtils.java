package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import com.app.core.*;
import custom_exceptions.CustomerInvalidException;

public class CustomerUtils {
	public static String authenticateCustomer(String email, String password, List<Customer> custList)
			throws CustomerInvalidException {
		Customer c = findByEmail(email, custList);
		if (c.getPassword().equals(password)) {
			return "Welcome " + c.getFirstName() + " " + c.getLastName();
		}
		throw new CustomerInvalidException("Invalid Password...");

	}
	public static long getNoOfMonthsCustomerHaveNotPaidSubscription(LocalDate lastSubDate) {
		Period p= Period.between(lastSubDate, LocalDate.now());
		//System.out.println(p.toTotalMonths());
		return p.toTotalMonths();
	}

	public static Customer findByEmail(String email, List<Customer> custList) throws CustomerInvalidException {
		Customer c = new Customer(email);
		int index = custList.indexOf(c);
		if (index == -1) // => not found !
			throw new CustomerInvalidException("Customer not found !!!!");
		return custList.get(index);
	}

	public static void changePassword(String email, String password, String newPassword, List<Customer> custList)
			throws CustomerInvalidException {
		Customer c = findByEmail(email, custList);
		if (c.getPassword().equals(password)) {
			c.setPassword(newPassword);
			System.out.println("Password is changed successfully...");
		}
		System.out.println("Please enter valid old password");
		
	}

	public static List<Customer> generateDummyCustomers() {
		List<Customer> customers = new ArrayList<>();

		customers.add(new Customer("John", "Doe", "john.doe@example.com", "password123", 1000,
				LocalDate.of(1990, 5, 15), LocalDate.of(2023, 1, 15), ServicePlan.SILVER));
		customers.add(new Customer("Alice", "Smith", "alice.smith@example.com", "securepass", 2000,
				LocalDate.of(1985, 8, 21),LocalDate.of(2022, 5, 10), ServicePlan.GOLD));
		customers.add(new Customer("Bob", "Johnson", "bob.j@example.com", "mysecretpassword", 5000,
				LocalDate.of(1982, 3, 7),LocalDate.of(2023, 8, 5), ServicePlan.DIAMOND));
		customers.add(new Customer("Eva", "Brown", "eva.b@example.com", "test123", 10000, LocalDate.of(1978, 10, 30),
				LocalDate.of(2021, 3, 20),ServicePlan.PLATINUM));

		return customers;
	}
}
