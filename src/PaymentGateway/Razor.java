package PaymentGateway;

public class Razor implements GatewayProvider{
    @Override
    public PaymentStatus processPayment(PaymentRequest request) {
        return null;
    }

    @Override
    public PaymentStatus getPaymentStatus(String transactionId) {
        return null;
    }

    @Override
    public void refund(String transactionId) {

    }
}
