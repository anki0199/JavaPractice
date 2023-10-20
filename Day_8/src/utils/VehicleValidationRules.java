package utils;

import java.util.Date;

import custom_exceptions.LicenseExpiredException;
import custom_exceptions.SpeedOutOfRangeException;

public class VehicleValidationRules {
	// declare static constants : speed range
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	
	private static final Date Date1 = new Date();

  //add a static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too slow");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too fast , FATAL!!!!!!");
		System.out.println("speed within range....");
	}
	
	

	public static void checkexpiry(Date Date2) throws LicenseExpiredException {
		if ((Date2.before(Date1))) {
			throw new LicenseExpiredException("expired");

		}
	}
}
