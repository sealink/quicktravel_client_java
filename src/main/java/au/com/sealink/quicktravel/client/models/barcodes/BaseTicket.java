package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.models.barcodes.core.Format;
import au.com.sealink.quicktravel.client.models.barcodes.core.Resource;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseTicket implements ITicket {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("format")
    @Expose
    private Format format;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("resource")
    @Expose
    private Resource resource;
    @SerializedName("reservation")
    @Expose
    private au.com.sealink.quicktravel.client.models.barcodes.core.Reservation reservation;
    @SerializedName("requires_review")
    @Expose
    private boolean requiresReview;
    @SerializedName("todo_items")
    @Expose
    private List<String> todoItems = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public au.com.sealink.quicktravel.client.models.barcodes.core.Reservation getReservation() {
        return reservation;
    }

    public void setReservation(au.com.sealink.quicktravel.client.models.barcodes.core.Reservation reservation) {
        this.reservation = reservation;
    }

    public boolean isRequiresReview() {
        return requiresReview;
    }

    public void setRequiresReview(boolean requiresReview) {
        this.requiresReview = requiresReview;
    }

    public List<String> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(List<String> todoItems) {
        this.todoItems = todoItems;
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public Date getLastUsedAt() {
        return null;
    }

    @Override
    public void setLastUsedAt(Date lastUsedAt) {

    }
}
