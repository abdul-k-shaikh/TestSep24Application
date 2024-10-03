package test.com.oct24.java17.sealedClasses;

public final class BankTransfer extends PaymentsMethod {

	@Override
	public void processPayment(PaymentsMethod payment) {
		System.out.println("BankTransfer PaymentMethod Impl...........");

	}

}
