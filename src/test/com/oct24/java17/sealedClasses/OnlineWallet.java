package test.com.oct24.java17.sealedClasses;

public final class OnlineWallet extends PaymentsMethod {

	@Override
	public void processPayment(PaymentsMethod payment) {
		System.out.println("OnlineWallet PaymentMethod Impl...........");
	}

}
