package PaymentGateway;

public class PaymentTransaction {

    GatewayProvider gatewayProvider ;
    int TransactionId ;
    int amount ;
    PaymentStatus paymentStatus;
    PaymentRequest paymentRequest ;

    public PaymentTransaction(GatewayProvider gatewayProvider, int transactionId, int amount, PaymentStatus paymentStatus, PaymentRequest paymentRequest) {
        this.gatewayProvider = gatewayProvider;
        TransactionId = transactionId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentRequest = paymentRequest;
    }

    public GatewayProvider getGatewayProvider() {
        return gatewayProvider;
    }

    public void setGatewayProvider(GatewayProvider gatewayProvider) {
        this.gatewayProvider = gatewayProvider;
    }

    public int getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(int transactionId) {
        TransactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentRequest getPaymentRequest() {
        return paymentRequest;
    }

    public void setPaymentRequest(PaymentRequest paymentRequest) {
        this.paymentRequest = paymentRequest;
    }
}
