//package y3.s1.cse240.project;
//
///**
// * A bank customer with a checking and a savings accounts.
// */
//public class Customer {
//	private int customerNumber;
//	private int pin;
//	private BankAccount checkingAccount;
//	private BankAccount savingsAccount;
//
//	/**
//	 * Constructs a customer with a given number and PIN.
//	 * @param customerNumber the customer number
//	 * @param pin the personal identification number
//	 */
//	public Customer(int customerNumber, int pin, double checkingBalance, double savingsBalance) {
//		this.customerNumber = customerNumber;
//		this.pin = pin;
//		checkingAccount = new BankAccount();
//		savingsAccount = new BankAccount();
//		checkingAccount.setBalance(checkingBalance);
//		savingsAccount.setBalance(savingsBalance);
//	}
//
//	/**
//	 * Tests if this customer matches a customer number
//	 * and PIN.
//	 * @param customerNumber a customer number
//	 * @param pin a personal identification number
//	 * @return true if the customer number and PIN match
//	 */
//	public boolean match(int customerNumber, int pin) {
//		return this.customerNumber == customerNumber && this.pin == pin;
//	}
//
//	/**
//	 * Gets the checking account of this customer.
//	 * @return the checking account
//	 */
//	public BankAccount getCheckingAccount() {
//		return checkingAccount;
//	}
//
//	/**
//	 * Gets the savings account of this customer.
//	 * @return the savings account
//	 */
//	public BankAccount getSavingsAccount() {
//		return savingsAccount;
//	}
//
//	/**
//	 * Gets the customer number of this customer.
//	 * @return the customer number
//	 */
//	public int getCustomerNumber() {
//		return customerNumber;
//	}
//
//	/**
//	 * Gets the account pin of this customer.
//	 * @return the account pin
//	 */
//	public int getPin() {
//		return pin;
//	}
//}
