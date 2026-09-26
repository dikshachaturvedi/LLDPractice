package MovieBooking;

public class Payment {

    public boolean makePayment(User userId, double amount) {

        System.out.println(
                "Payment initiated for user " + userId
        );

        // payment gateway
        // success/failure

        return true;
    }
}
