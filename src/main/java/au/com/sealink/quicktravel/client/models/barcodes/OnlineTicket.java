package au.com.sealink.quicktravel.client.models.barcodes;

public class OnlineTicket extends IssuedTicket {
    @Override
    public boolean isActive() {
        return true;
    }
}
