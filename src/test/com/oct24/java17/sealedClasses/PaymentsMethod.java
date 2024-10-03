package test.com.oct24.java17.sealedClasses;

public abstract sealed class PaymentsMethod permits CreditCard, BankTransfer, OnlineWallet {

	public abstract void processPayment(PaymentsMethod payment);
}
