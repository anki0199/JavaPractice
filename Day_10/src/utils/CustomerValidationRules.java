package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exceptions.CustomerInvalidException;

public class CustomerValidationRules {
	public static void checkForDupCustomer(String email, List<Customer> customerList) throws CustomerInvalidException {
		Customer cust = new Customer(email);
		if (customerList.contains(cust)) {
			throw new CustomerInvalidException("Customer can't be addded: customer with same email exists");
		}
		System.out.println("no dups ...");
	}

	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static void checkIfRegAmountIsSufficient(double registrationAmount, ServicePlan plan)
			throws CustomerInvalidException {
		if (!(registrationAmount >= plan.getServicePlanCost())) {
			throw new CustomerInvalidException("registrationAmount is not sufficient as per plan");
		}
		System.out.println("done");
	}

	public static LocalDate parseAndValidateDateofBirth(String date)
			throws CustomerInvalidException, DateTimeParseException {
		LocalDate validateDOB = LocalDate.parse(date);
		if (validateDOB.isAfter(LocalDate.of(2005, 1, 1)))
			throw new CustomerInvalidException("Age should be above 18...");
		return validateDOB;
	}

	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double registrationAmount, String dob, String regDate, String plan, List<Customer> custList)
			throws CustomerInvalidException, IllegalArgumentException, DateTimeParseException {

		LocalDate validatedDoB = parseAndValidateDateofBirth(dob);
		LocalDate validatedRegDate = parseAndValidateDateofBirth(regDate);
		ServicePlan validatedPlan = parseAndValidatePlan(plan);
		checkIfRegAmountIsSufficient(registrationAmount, validatedPlan);
		checkForDupCustomer(email, custList);

		return new Customer(firstName, lastName, email, password, registrationAmount, validatedDoB, validatedRegDate,
				validatedPlan);
	}

}
