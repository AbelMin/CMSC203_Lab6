
public class CheckingAccount extends BankAccount
{
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
        setAccountNumber(getAccountNumber() + "-10");
	}
	public boolean widthdraw(double amount) {
		double totalAmount = amount + FEE;
        boolean isWithdrawn = super.withdraw(totalAmount);
        return isWithdrawn;
	}
}