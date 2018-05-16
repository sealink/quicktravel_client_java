package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.models.barcodes.*;
import au.com.sealink.quicktravel.client.models.barcodes.core.InvalidTicketException;
import com.google.gson.Gson;

public class TicketScanner {
    public static ITicket fromJson(String json) throws InvalidTicketException {
        try {
            BaseTicket ticket = new Gson().fromJson(json, BaseTicket.class);
            switch (ticket.getFormat()) {
                case ConsumerSplit:
                    return new Gson().fromJson(json, ConsumerSplitTicket.class);
                case Reservation:
                    return new Gson().fromJson(json, ReservationTicket.class);
                case IssuedTicket:
                    return new Gson().fromJson(json, IssuedTicket.class);
            }
            return null;
        } catch (com.google.gson.JsonSyntaxException e) {
            throw new InvalidTicketException("Invalid ticket format", e);
        }
    }
}
