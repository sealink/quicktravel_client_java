package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class Checkout {
    @SerializedName("booking_id")
    @Expose
    private int bookingId;

    @SerializedName("pay_balance")
    @Expose
    private boolean payBalance = false;

    @SerializedName("payment")
    @Expose
    private Payment payment = new Payment();

    public Checkout()
    {
        this.payment.setUid(UUID.randomUUID().toString());
    }

    //region Getter/Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public boolean isPayBalance() {
        return payBalance;
    }

    public void setPayBalance(boolean payBalance) {
        this.payBalance = payBalance;
    }
    //endregion
}
