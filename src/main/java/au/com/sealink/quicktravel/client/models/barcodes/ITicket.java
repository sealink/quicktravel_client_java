package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.models.barcodes.core.Format;
import au.com.sealink.quicktravel.client.models.barcodes.core.Resource;
import au.com.sealink.quicktravel.client.models.barcodes.core.Reservation;

import java.util.Date;
import java.util.List;

public interface ITicket {
    int getId();

    void setId(int id);

    Format getFormat();

    void setFormat(Format format);

    String getReference();

    void setReference(String reference);

    Resource getResource();

    void setResource(Resource resource);

    Reservation getReservation();

    void setReservation(Reservation reservation);

    boolean isRequiresReview();

    void setRequiresReview(boolean requiresReview);

    List<String> getTodoItems();

    void setTodoItems(List<String> todoItems);

    boolean isActive();

    Date getLastUsedAt();

    void setLastUsedAt(Date date);
}
