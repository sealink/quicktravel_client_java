package au.com.sealink.quicktravel.client.models.reservationFor.scheduledTrip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import au.com.sealink.quicktravel.client.models.reservationFor.core.Segment;

public class Create {
    @SerializedName("booking_id")
    @Expose
    private int bookingId;

    @SerializedName("add_return")
    @Expose
    private Boolean addReturn;

    @SerializedName("forward")
    @Expose
    private Segment forward = new Segment();

    @SerializedName("return")
    @Expose
    private Segment returning = new Segment();

    @SerializedName("segments")
    @Expose
    private List<String> mSegments = new ArrayList<>();

    public Create() {
        this.mSegments.add("forward");
        this.mSegments.add("return");
    }

    //region GETTER/SETTERS
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Boolean getAddReturn() {
        return addReturn;
    }

    public void setAddReturn(Boolean addReturn) {
        this.addReturn = addReturn;
    }

    public Segment getForward() {
        return forward;
    }

    public Segment getReturning() {
        return returning;
    }
    //endregion
}
