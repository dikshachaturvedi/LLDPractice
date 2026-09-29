package PaymentGateway;

public class PaymentRequest {
    int requestId ;
    PaymentType  paymentType;
    int amout ;
    String user ;

    public PaymentRequest(int requestId, PaymentType paymentType, int amout, String user) {
        this.requestId = requestId;
        this.paymentType = paymentType;
        this.amout = amout;
        this.user = user;
    }


    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
