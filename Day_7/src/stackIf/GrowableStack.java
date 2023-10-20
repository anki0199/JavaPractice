package stackIf;

public class GrowableStack extends FixedStack {
	
	@Override
	public void push(Customer obj) {
		if (super.top >= STACK_SIZE - 1) {
			Customer[] newArr = new Customer[super.customer.length * 2];
			int i = 0;
			for (Customer c : super.customer) {
				newArr[i++] = c;
			}
			super.customer = newArr;
		}
		super.customer[++top] = obj;
	}

}
