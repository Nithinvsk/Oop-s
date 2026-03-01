package JavaOops;

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException (String message) {
		super(message);
	}
}


public class ATMapplicationException {
	static void atm(String pin , double balance) throws SecurityException,InsufficientBalanceException{
		if (!pin.equals("0826")) {
			throw new SecurityException("You Entered the Wrong Pin");
		}
		if (balance > 2500000) {
			throw new InsufficientBalanceException("Balance is Insufficient");
		}
		double remaining_balance = 2500000 - balance;
		System.out.println("Withdrawal Money : "+balance);
		System.out.println("Remaining Balance : "+remaining_balance);
	}
	public static void main(String[] args) {
		try {
			atm("0826",50000);
		}
		catch (SecurityException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}
		catch (InsufficientBalanceException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}
		finally {
			System.out.println("Thank You Visit Again");
		}
	}
}
