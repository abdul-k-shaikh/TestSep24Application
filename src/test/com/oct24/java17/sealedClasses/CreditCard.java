package test.com.oct24.java17.sealedClasses;

public final class CreditCard extends PaymentsMethod {

	@Override
	public void processPayment(PaymentsMethod payment) {
		System.out.println("CreditCard PaymentMethod Impl...........");
		
	}

}
