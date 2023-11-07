
public class SavingsAccount extends BankAccount
{
	private double rate;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
        rate = 0.025;
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
	public void postInterest() {
		double interest = getBalance() * (rate / 12); // Monthly interest calculation
        deposit(interest);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
}