package custom_exceptions;

public class CustomerInvalidException extends Exception {
	public CustomerInvalidException(String errMsg) {
		super(errMsg);
	}
}
