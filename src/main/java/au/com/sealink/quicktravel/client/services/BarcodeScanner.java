package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.models.barcodes.Base;
import au.com.sealink.quicktravel.client.models.barcodes.ConsumerSplit;
import au.com.sealink.quicktravel.client.models.barcodes.IssuedTicket;
import au.com.sealink.quicktravel.client.models.barcodes.Reservation;
import com.google.gson.Gson;

public class BarcodeScanner {
    public static Object fromJson(String json) {
        Base ticket = new Gson().fromJson(json, Base.class);
        switch(ticket.getFormat()) {
            case ConsumerSplit:
                return new Gson().fromJson(json, ConsumerSplit.class);
            case Reservation:
                return new Gson().fromJson(json, Reservation.class);
            case IssuedTicket:
                return new Gson().fromJson(json, IssuedTicket.class);
        }
        return null;
    }
}
