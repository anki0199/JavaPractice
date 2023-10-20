package stackIf;

public class FixedStack implements Stack {
	protected Customer[] customer;
	protected int top;

	public FixedStack() {
		customer = new Customer[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Customer obj) {
		if (top < STACK_SIZE - 1) {
			customer[++top] = obj;
		} else {
			System.out.println("Stack is full!");
		}

	}

	@Override
	public Customer pop() {
		if (top >= 0) {
			return customer[top--];
		} else {
			System.out.println("Stack is empty!");
			return null;
		}
	}

}
