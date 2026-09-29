package PaymentGateway;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    Map<Integer , PaymentTransaction> tra = new HashMap<>() ;
    Map<Integer , PaymentTransaction>  idem = new HashMap<>() ;


    public PaymentTransaction makePayment(PaymentRequest paymentRequest){

        // check idempotency
        if(idem.containsKey(paymentRequest.requestId)){
            return idem.get(paymentRequest.requestId);
        }

        // create transaction
        GatewayProvider gp = new Razor();
        PaymentTransaction paymentTransaction = new PaymentTransaction(gp , 123 , 500 , PaymentStatus.INITIATED , paymentRequest);
        tra.put(123 , paymentTransaction );
        idem.put(123 , paymentTransaction );

paymentTransaction.setPaymentStatus(PaymentStatus.PROCESSING);
gp.processPayment(paymentRequest);
        paymentTransaction.setPaymentStatus(PaymentStatus.SUCCESS);
        return paymentTransaction ;
    }
}
