package PaymentGateway;

public interface GatewayProvider {
   public PaymentStatus processPayment(PaymentRequest request);
    public PaymentStatus getPaymentStatus(String transactionId);
    public void refund(String transactionId);
}
