package custom_ordering;

import java.util.Comparator;

import com.app.core.Customer;

public class CustomeDobAndLastNameComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer c1, Customer c2) {
		int returnedResult= c1.getDob().compareTo(c2.getDob());
		if(returnedResult==0) {
			return c1.getLastName().compareTo(c2.getLastName());
		}
		return returnedResult;
	}

}
