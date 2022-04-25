package parkinglot;

public class ObjectGenerator {

	public static Payment paymentSetter(int price, int token1) {
		Payment payment = new Payment();
		payment.setAmount(price);
		payment.setTokenNumber(token1);
		payment.setPaymentStatus(true);
		return payment;
	}
}
