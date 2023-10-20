package Tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import custom_exceptions.LicenseExpiredException;
import custom_exceptions.SpeedOutOfRangeException;
import utils.VehicleValidationRules;

public class Test {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter curnt speed");
			// invoke a static method for speed validation.
			VehicleValidationRules.validateSpeed(sc.nextInt());
			System.out.println("end of try...");

			System.out.println("Enter the expiry date of license");
			Date Date1 = sdf.parse(sc.next());

			VehicleValidationRules.checkexpiry(Date1);

			System.out.println("license not expired");
		} catch (SpeedOutOfRangeException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (LicenseExpiredException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println(e);

			e.printStackTrace();
		}

	}

}
