package test.com.oct24.java17.sealedClasses;

public class SealedClassClient {

	public static void handlePayment(PaymentsMethod paymentsMethod) {
		switch (paymentsMethod) {
		case CreditCard creditCard -> creditCard.processPayment(paymentsMethod);
		case BankTransfer bankTransfer -> bankTransfer.processPayment(paymentsMethod);
		case OnlineWallet onlineWallet -> onlineWallet.processPayment(paymentsMethod);
		}
	}

	public static void main(String[] args) {
		PaymentsMethod paymentsMethod = new CreditCard();
		handlePayment(paymentsMethod);
		paymentsMethod = new BankTransfer();
		handlePayment(paymentsMethod);
		paymentsMethod = new OnlineWallet();
		handlePayment(paymentsMethod);

	}

}