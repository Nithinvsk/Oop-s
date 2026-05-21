package JavaOops;

class InvalidQuantityException extends Exception { 
	InvalidQuantityException(String message) {
		super(message);
	}
}

class LimitExceededException extends Exception { 
	LimitExceededException(String message) {
		super(message);
	}
}

public class OnlineShoppingSystemException {
	static void Order(int quantity,int price_per_each_item) throws InvalidQuantityException,LimitExceededException {
		if (quantity <= 0) {
			throw new InvalidQuantityException("Quantity Must be More than 0");
		}
		int totalbill = quantity * price_per_each_item;
		if (totalbill > 250000) {
			throw new LimitExceededException("TotalBill Cannot be more than 250000");
		}
		System.out.println("Order Confirmation");
		System.out.println("Quantity : "+quantity);
		System.out.println("Total Bill : "+totalbill);
	}
	public static void main(String[] args) {
		try {
			Order(5,1000);
			Order(0,1000);
		}
		catch (InvalidQuantityException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}
		catch (LimitExceededException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}
		finally {
			System.out.println("Thank you for shopping with us");
		}
	}
}
